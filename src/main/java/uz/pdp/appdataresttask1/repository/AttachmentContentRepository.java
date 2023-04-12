package uz.pdp.appdataresttask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdataresttask1.entity.AttachmentContent;
import uz.pdp.appdataresttask1.projection.CustomAttachmentContent;

@RepositoryRestResource(path = "attachmentContent",collectionResourceRel = "list",excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
