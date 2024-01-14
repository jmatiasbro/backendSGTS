package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.PermisoEntity;

@Repository
public interface PermisoRepository extends JpaRepository<PermisoEntity, Integer> {

}
