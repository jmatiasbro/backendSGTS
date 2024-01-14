package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.RecursoGgEntity;

@Repository
public interface RecursoRepository extends JpaRepository<RecursoGgEntity, Integer> {

}
