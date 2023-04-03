package googledrive.domain;

import googledrive.IndexingApplication;
import googledrive.domain.FileIndex;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        FileIndex fileIndex = new FileIndex(this);
        fileIndex.publishAfterCommit();
    }

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexingApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    public static void indexFile(UploadFile uploadFile) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        FileIndex fileIndex = new FileIndex(index);
        fileIndex.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(uploadFile.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);

            FileIndex fileIndex = new FileIndex(index);
            fileIndex.publishAfterCommit();

         });
        */

    }
}
