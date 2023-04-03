package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIndex extends AbstractEvent {

    private Long id;

    public FileIndex(Index aggregate) {
        super(aggregate);
    }

    public FileIndex() {
        super();
    }
}
