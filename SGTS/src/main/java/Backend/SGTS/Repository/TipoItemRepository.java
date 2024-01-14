package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.TipoItemEntity;

@Repository
public interface TipoItemRepository extends JpaRepository<TipoItemEntity, Integer> {

}
