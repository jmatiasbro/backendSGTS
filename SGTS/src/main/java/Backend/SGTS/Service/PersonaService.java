package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.PersonaEntity;
import Backend.SGTS.Repository.PersonaRepository;

@Service
public class PersonaService {

	// Inyecto repositorio
	@Autowired
	PersonaRepository personaRepository;
	
	// Obtengo todos las personas
	public List<PersonaEntity> getAll() {
		return personaRepository.findAll();
	}
	
	// Obtengo una persona por id
	public PersonaEntity getById(Integer id) {
		return personaRepository.findById(id).orElse(null);
	}
	
	// Creo una persona
	public PersonaEntity create(PersonaEntity persona) {
		return personaRepository.save(persona);
	}
	
	// Actualizo una persona
	public PersonaEntity update(PersonaEntity persona) {
		return personaRepository.save(persona);
	}
	
	// Elimino una persona
	public void delete(Integer id) {
		personaRepository.deleteById(id);
	}
	
}
