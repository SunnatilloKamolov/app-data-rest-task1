package uz.pdp.appdataresttask1.projection;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
    boolean getActive();
    Category parentCategory();

}
