package googledrive.domain;

import googledrive.VideoProcessingApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Filestatus_table")
@Data
public class Filestatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String field;

    private String url;

    public static FilestatusRepository repository() {
        FilestatusRepository filestatusRepository = VideoProcessingApplication.applicationContext.getBean(
            FilestatusRepository.class
        );
        return filestatusRepository;
    }
}
