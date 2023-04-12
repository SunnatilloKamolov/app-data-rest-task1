package uz.pdp.appdataresttask1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    boolean getActive();
    String getPhoneNumber();
}
