package Backend.SGTS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Backend.SGTS.Entity.UsuarioPermisoEntity;
import Backend.SGTS.Service.UsuarioPermisoService;

@RestController
@RequestMapping("/usuarioPermiso")
public class UsuarioPermisoController {

	// Inyecto Servicio de UsuarioPermiso
	@Autowired
	UsuarioPermisoService usuarioPermisoService;
	
	// Obtengo todos los usuarioPermisos
	@GetMapping("/getAll")
	public List<UsuarioPermisoEntity> getAll() {
		return usuarioPermisoService.getAll();
	}
	
	// Obtengo un usuarioPermiso por id
	@GetMapping("/{id}")
	public UsuarioPermisoEntity getById(@PathVariable Integer id) {
		return usuarioPermisoService.getById(id);
	}
	
	// Creo un usuarioPermiso
	@PostMapping("/create")
	public UsuarioPermisoEntity create(@RequestBody UsuarioPermisoEntity usuarioPermiso) {
		return usuarioPermisoService.create(usuarioPermiso);
	}
	
	// Actualizo un usuarioPermiso
	@PutMapping("/update/{id}")
	public UsuarioPermisoEntity update(@PathVariable("id") Integer id,
			@RequestBody UsuarioPermisoEntity usuarioPermiso) {

		UsuarioPermisoEntity upDateUsuarioPermiso = usuarioPermisoService.getById(id);
		upDateUsuarioPermiso.setUsuarioIdUsuario(usuarioPermiso.getUsuarioIdUsuario());
		upDateUsuarioPermiso.setPermisoIdPermiso(usuarioPermiso.getPermisoIdPermiso());
		usuarioPermisoService.update(upDateUsuarioPermiso);

		return upDateUsuarioPermiso;
	}
	
	// Elimino un usuarioPermiso
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		usuarioPermisoService.delete(id);
	}
}
