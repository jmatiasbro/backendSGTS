package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.TipoServicioEntity;

@Repository
public interface TipoServicioRepository extends JpaRepository<TipoServicioEntity, Integer> {

}
