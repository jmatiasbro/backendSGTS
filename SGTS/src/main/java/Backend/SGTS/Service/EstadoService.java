package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.EstadoEntity;
import Backend.SGTS.Repository.EstadoRepository;

@Service
public class EstadoService {

	// Inyecto repositorio
	@Autowired
	EstadoRepository estadoRepository;
	
	// Obtengo todos los estados
	public List<EstadoEntity> getAll() {
		return estadoRepository.findAll();
	}
	
	// Obtengo un estado por id
	public EstadoEntity getById(Integer id) {
		return estadoRepository.findById(id).orElse(null);
	}
	
	// Creo un estado
	public EstadoEntity create(EstadoEntity estado) {
		return estadoRepository.save(estado);
	}
	
	// Actualizo un estado
	public EstadoEntity update(EstadoEntity estado) {
		return estadoRepository.save(estado);
	}
	
	// Elimino un estado
	public void delete(Integer id) {
		estadoRepository.deleteById(id);
	}
	
}
