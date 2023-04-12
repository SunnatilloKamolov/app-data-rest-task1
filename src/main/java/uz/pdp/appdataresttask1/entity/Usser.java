package uz.pdp.appdataresttask1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appdataresttask1.entity.template.AbsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Usser extends AbsEntity {
    private String lastName;
    @Column(nullable = false,unique = false)
    private String phoneNumber;
    private String password;
}
