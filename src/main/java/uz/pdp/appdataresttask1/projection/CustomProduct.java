package uz.pdp.appdataresttask1.projection;

import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Attachment;
import uz.pdp.appdataresttask1.entity.Category;
import uz.pdp.appdataresttask1.entity.Measurement;
import uz.pdp.appdataresttask1.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    boolean getActive();

    Category getCategory();

    Attachment getPhoto();

    Measurement getMeasurement();

    String getCode();
}
