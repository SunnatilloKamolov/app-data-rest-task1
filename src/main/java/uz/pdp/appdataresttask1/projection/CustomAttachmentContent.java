package uz.pdp.appdataresttask1.projection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Attachment;
import uz.pdp.appdataresttask1.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();
  byte[] getBytes();
  Attachment getAttachment();

}
