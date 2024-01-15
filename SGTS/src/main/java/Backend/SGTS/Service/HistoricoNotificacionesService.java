package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.HistoricoNotificacionesEntity;
import Backend.SGTS.Repository.HistoricoNotificacionesRepository;

@Service
public class HistoricoNotificacionesService {

	// Inyecto el repositorio
	@Autowired
	private HistoricoNotificacionesRepository historicoNotificacionesRepository;
	
	// Obtener todas las notificaciones
	public List<HistoricoNotificacionesEntity> getAll() {
		return historicoNotificacionesRepository.findAll();
	}
	
	// Obtener una notificacion por id
	public HistoricoNotificacionesEntity getById(Integer id) {
		return historicoNotificacionesRepository.findById(id).orElse(null);
	}
	
	// Crear una notificacion
	public HistoricoNotificacionesEntity create(HistoricoNotificacionesEntity historicoNotificaciones) {
		return historicoNotificacionesRepository.save(historicoNotificaciones);
	}
	
	// Actualizar una notificacion
	public HistoricoNotificacionesEntity update(HistoricoNotificacionesEntity historicoNotificaciones) {
		return historicoNotificacionesRepository.save(historicoNotificaciones);
	}
	
	// Eliminar una notificacion
	public void delete(Integer id) {
		historicoNotificacionesRepository.deleteById(id);
	}
	
}
