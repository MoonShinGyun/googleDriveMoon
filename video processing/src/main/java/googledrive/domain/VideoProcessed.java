package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private String id;
    private String fileid;
    private String url;

    public VideoProcessed() {
        super();
    }
}
