package uz.pdp.appdataresttask1.projection;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdataresttask1.entity.Currency;
import uz.pdp.appdataresttask1.entity.Input;
import uz.pdp.appdataresttask1.entity.Supplier;
import uz.pdp.appdataresttask1.entity.WareHouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Timestamp getDate();

    WareHouse getWareHouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
