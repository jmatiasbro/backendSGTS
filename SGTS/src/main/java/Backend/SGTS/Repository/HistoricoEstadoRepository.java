package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.HistoricoEstadoEntity;

@Repository
public interface HistoricoEstadoRepository extends JpaRepository<HistoricoEstadoEntity, Integer> {

}
