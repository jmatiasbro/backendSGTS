package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.HistoricoNotificacionesEntity;

@Repository
public interface HistoricoNotificacionesRepository extends JpaRepository<HistoricoNotificacionesEntity, Integer>{

}