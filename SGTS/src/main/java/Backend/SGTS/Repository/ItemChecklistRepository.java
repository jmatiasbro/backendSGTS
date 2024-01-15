package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.ItemChecklistEntity;

@Repository
public interface ItemChecklistRepository extends JpaRepository<ItemChecklistEntity, Integer> {

}
