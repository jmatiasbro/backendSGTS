package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.UsuarioPermisoEntity;

@Repository
public interface UsuarioPermisoRepository extends JpaRepository<UsuarioPermisoEntity, Integer> {

}
