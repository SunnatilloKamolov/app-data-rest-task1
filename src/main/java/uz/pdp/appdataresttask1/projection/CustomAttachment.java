package uz.pdp.appdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    long getSize();
    String getContentType();
}
