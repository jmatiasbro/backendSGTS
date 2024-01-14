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

import Backend.SGTS.Entity.DependenciaEntity;
import Backend.SGTS.Service.DependenciaService;

@RestController
@RequestMapping("/dependencia")
public class DependenciaController {

	// Inyecto Servicio de Dependencia
	@Autowired
	DependenciaService dependenciaService;
	
	// Obtengo todas las dependencias
	@GetMapping("/getAll")
	public List<DependenciaEntity> getAll() {
		return dependenciaService.getAll();
	}
	
	// Obtengo una dependencia por id
	@GetMapping("/{id}")
	public DependenciaEntity getById(@PathVariable Integer id) {
		return dependenciaService.getById(id);
	}
	
	// Creo una dependencia
	@PostMapping("/create")
	public DependenciaEntity create(@RequestBody DependenciaEntity dependencia) {
		return dependenciaService.create(dependencia);
	}
	
	// Actualizo una dependencia
	@PutMapping("/update/{id}")
	public DependenciaEntity update(@PathVariable("id") Integer id, @RequestBody DependenciaEntity dependencia) {

		DependenciaEntity upDateDependencia = dependenciaService.getById(id);
		
		upDateDependencia.setDependencia(dependencia.getDependencia());
		
		dependenciaService.update(upDateDependencia);
		return upDateDependencia;
	}
	
	// Elimino una dependencia
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		dependenciaService.delete(id);
	}
}
