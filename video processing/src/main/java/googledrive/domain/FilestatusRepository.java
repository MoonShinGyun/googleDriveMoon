package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "filestatuses",
    path = "filestatuses"
)
public interface FilestatusRepository
    extends PagingAndSortingRepository<Filestatus, String> {}
