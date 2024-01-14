package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.UsuarioPermisoEntity;
import Backend.SGTS.Repository.UsuarioPermisoRepository;

@Service
public class UsuarioPermisoService {

	// Inyecto repositorio
	@Autowired
	UsuarioPermisoRepository usuarioPermisoRepository;
	
	// Obtengo todos los usuarioPermiso
	public List<UsuarioPermisoEntity> getAll() {
		return usuarioPermisoRepository.findAll();
	}
	
	// Obtengo un usuarioPermiso por id
	public UsuarioPermisoEntity getById(Integer id) {
		return usuarioPermisoRepository.findById(id).orElse(null);
	}
	
	// Creo un usuarioPermiso
	public UsuarioPermisoEntity create(UsuarioPermisoEntity usuarioPermiso) {
		return usuarioPermisoRepository.save(usuarioPermiso);
	}
	
	// Actualizo un usuarioPermiso
	public UsuarioPermisoEntity update(UsuarioPermisoEntity usuarioPermiso) {
		return usuarioPermisoRepository.save(usuarioPermiso);
	}
	
	// Elimino un usuarioPermiso
	public void delete(Integer id) {
		usuarioPermisoRepository.deleteById(id);
	}
}
