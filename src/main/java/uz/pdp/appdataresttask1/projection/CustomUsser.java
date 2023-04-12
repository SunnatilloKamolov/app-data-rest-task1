package uz.pdp.appdataresttask1.projection;

import jakarta.persistence.Column;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Usser;

@Projection(types = Usser.class)
public interface CustomUsser {
    Integer getId();

    String getName();

    boolean getActive();

    String getLastName();

    String getPhoneNumber();

    String getPassword();
}
