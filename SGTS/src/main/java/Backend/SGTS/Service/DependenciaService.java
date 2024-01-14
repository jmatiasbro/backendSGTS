package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.DependenciaEntity;
import Backend.SGTS.Repository.DependenciaRepository;

@Service
public class DependenciaService {

	// Inyecto el repositorio
	@Autowired
	private DependenciaRepository dependenciaRepository;
	
	// Obtener todas las dependencias
	public List<DependenciaEntity> getAll() {
		return dependenciaRepository.findAll();
	}
	
	// Obtener una dependencia por id
	public DependenciaEntity getById(Integer id) {
		return dependenciaRepository.findById(id).orElse(null);
	}
	
	// Creo una dependencia
	public DependenciaEntity create(DependenciaEntity dependencia) {
		return dependenciaRepository.save(dependencia);
	}
	
	// Actualizo una dependencia
	public DependenciaEntity update(DependenciaEntity dependencia) {
		return dependenciaRepository.save(dependencia);
	}
	
	// Elimino una dependencia
	public void delete(Integer id) {
		dependenciaRepository.deleteById(id);
	}
}
