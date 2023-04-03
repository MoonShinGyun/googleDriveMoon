package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UploadFile extends AbstractEvent {

    private Long id;

    public UploadFile(File aggregate) {
        super(aggregate);
    }

    public UploadFile() {
        super();
    }
}
