package uz.pdp.appdataresttask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdataresttask1.entity.WareHouse;
import uz.pdp.appdataresttask1.projection.CustomWareHouse;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = CustomWareHouse.class)
public interface WareHouseRepository extends JpaRepository<WareHouse,Integer> {
}
