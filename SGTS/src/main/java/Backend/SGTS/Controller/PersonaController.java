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

import Backend.SGTS.Entity.PersonaEntity;
import Backend.SGTS.Service.PersonaService;

@RestController
@RequestMapping("/persona")
class PersonaController {

	// Inyecto Servicio de Persona
	@Autowired
	PersonaService personaService;
	
	// Obtengo todas las personas
	@GetMapping("/getAll")
	public List<PersonaEntity> getAll() {
		return personaService.getAll();
	}
	
	// Obtengo una persona por id
	@GetMapping("/{id}")
	public PersonaEntity getById(@PathVariable Integer id) {
		return personaService.getById(id);
	}
	
	// Creo una persona
	@PostMapping("/create")
	public PersonaEntity create(@RequestBody PersonaEntity persona) {
		return personaService.create(persona);
	}
	
	// Actualizo una persona
	@PutMapping("/update/{id}")
	public PersonaEntity update(@PathVariable("id") Integer id, @RequestBody PersonaEntity persona) {

		PersonaEntity upDatePersona = personaService.getById(id);
		upDatePersona.setDni(persona.getDni());
		upDatePersona.setNombre(persona.getNombre());
		upDatePersona.setApellido(persona.getApellido());
		upDatePersona.setTelefono(persona.getTelefono());
		upDatePersona.setEmail(persona.getEmail());
		personaService.update(upDatePersona);

		return upDatePersona;
	}
	
	// Elimino una persona
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		personaService.delete(id);
	}
}
