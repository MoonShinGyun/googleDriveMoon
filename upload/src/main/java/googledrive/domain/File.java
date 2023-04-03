package googledrive.domain;

import googledrive.UploadApplication;
import googledrive.domain.UploadFile;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        UploadFile uploadFile = new UploadFile(this);
        uploadFile.publishAfterCommit();
    }

    public static FileRepository repository() {
        FileRepository fileRepository = UploadApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }
}
