package uz.pdp.appdataresttask1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.template.AbsEntity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Product extends AbsEntity {
    @ManyToOne
    private Category category;
    @ManyToOne
    private Attachment photo;
    @ManyToOne
    private Measurement measurement;
    private String code;
}
