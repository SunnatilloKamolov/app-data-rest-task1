package uz.pdp.appdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    boolean getActive();
    String getPhoneNumber();
}
