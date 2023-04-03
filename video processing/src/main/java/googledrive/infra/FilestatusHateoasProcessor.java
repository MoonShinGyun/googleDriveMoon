package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FilestatusHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Filestatus>> {

    @Override
    public EntityModel<Filestatus> process(EntityModel<Filestatus> model) {
        return model;
    }
}
