package uz.pdp.appdataresttask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appdataresttask1.entity.Usser;
import uz.pdp.appdataresttask1.projection.CustomUsser;

@RepositoryRestResource(path = "usser",collectionResourceRel = "list",excerptProjection = CustomUsser.class)
public interface UsserRepository extends JpaRepository<Usser,Integer> {
}
