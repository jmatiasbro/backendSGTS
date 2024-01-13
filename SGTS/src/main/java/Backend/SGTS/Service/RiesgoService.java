package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.RiesgoEntity;
import Backend.SGTS.Repository.RiesgoRepository;

@Service
public class RiesgoService {

	// Inyecto repositorio
	@Autowired
	RiesgoRepository riesgoRepository;
	
	// Obtengo todos los riesgos
	public List<RiesgoEntity> getAll() {
		return riesgoRepository.findAll();
	}
	
	// Obtengo un riesgo por id
	public RiesgoEntity getById(Integer id) {
		return riesgoRepository.findById(id).orElse(null);
	}
	
	// Creo un riesgo
	public RiesgoEntity create(RiesgoEntity riesgo) {
		return riesgoRepository.save(riesgo);
	}
	
	// Actualizo un riesgo
	public RiesgoEntity update(RiesgoEntity riesgo) {
		return riesgoRepository.save(riesgo);
	}
	
	// Elimino un riesgo
	public void delete(Integer id) {
		riesgoRepository.deleteById(id);
	}
}
