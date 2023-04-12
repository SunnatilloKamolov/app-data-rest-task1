package uz.pdp.appdataresttask1.projection;

import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Output;
import uz.pdp.appdataresttask1.entity.OutputProduct;
import uz.pdp.appdataresttask1.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Output getOutput();
    String getAmount();
    String getPrice();
}
