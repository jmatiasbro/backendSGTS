package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.RiesgoEntity;

@Repository
public interface RiesgoRepository extends JpaRepository<RiesgoEntity, Integer>{

}
