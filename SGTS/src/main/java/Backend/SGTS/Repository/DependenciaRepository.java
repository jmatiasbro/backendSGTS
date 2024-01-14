package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.DependenciaEntity;

@Repository
public interface DependenciaRepository extends JpaRepository<DependenciaEntity, Integer> {

}
