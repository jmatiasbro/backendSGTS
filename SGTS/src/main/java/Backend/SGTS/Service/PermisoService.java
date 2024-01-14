package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.PermisoEntity;
import Backend.SGTS.Repository.PermisoRepository;

@Service
public class PermisoService {

	// inyecto repositorio
	@Autowired
	PermisoRepository permisoRepository;
	
	// obtengo todos los permisos
	public List<PermisoEntity> getAll() {
		return permisoRepository.findAll();
	}
	
	// obtengo un permiso por id
	public PermisoEntity getById(Integer id) {
		return permisoRepository.findById(id).orElse(null);
	}
	
	// creo un permiso
	public PermisoEntity create(PermisoEntity permiso) {
		return permisoRepository.save(permiso);
	}
	
	// actualizo un permiso
	public PermisoEntity update(PermisoEntity permiso) {
		return permisoRepository.save(permiso);
	}
	
	// elimino un permiso
	public void delete(Integer id) {
		permisoRepository.deleteById(id);
	}
}
