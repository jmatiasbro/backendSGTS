package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.ServicioEntity;

@Repository
public interface ServicioRepository extends JpaRepository<ServicioEntity, Integer>{

}