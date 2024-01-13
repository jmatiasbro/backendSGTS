package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.RolEntity;
import Backend.SGTS.Repository.RolRepository;

@Service
public class RolService {

	// Inyecto repositorio
	@Autowired
	RolRepository rolRepository;
	
	// Obtengo todos los roles
	public List<RolEntity> getAll() {
		return rolRepository.findAll();
	}
	
	// Obtengo un rol por id
	public RolEntity getById(Integer id) {
		return rolRepository.findById(id).orElse(null);
	}
	
	// Creo un rol
	public RolEntity create(RolEntity rol) {
		return rolRepository.save(rol);
	}
	
	// Actualizo un rol
	public RolEntity update(RolEntity rol) {
		return rolRepository.save(rol);
	}
	
	// Elimino un rol
	public void delete(Integer id) {
		rolRepository.deleteById(id);
	}
}
