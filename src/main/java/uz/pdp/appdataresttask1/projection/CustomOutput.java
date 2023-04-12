package uz.pdp.appdataresttask1.projection;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Currency;
import uz.pdp.appdataresttask1.entity.Output;
import uz.pdp.appdataresttask1.entity.WareHouse;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Timestamp getDate();

    WareHouse getWareHouse();

    Currency getCurrency();
    String getFactureNumber();

    String getCode();
}
