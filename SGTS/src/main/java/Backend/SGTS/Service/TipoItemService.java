package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.TipoItemEntity;
import Backend.SGTS.Repository.TipoItemRepository;

@Service
public class TipoItemService {

	// Inyecto el repositorio
	@Autowired
	private TipoItemRepository tipoItemRepository;
	
	// Obtener todas los tipos de item
	public List<TipoItemEntity> getAll() {
		return tipoItemRepository.findAll();
	}
	
	// Obtener un tipo de item por id
	public TipoItemEntity getById(Integer id) {
		return tipoItemRepository.findById(id).orElse(null);
	}
	
	// Creo un tipo de item
	public TipoItemEntity create(TipoItemEntity tipoItem) {
		return tipoItemRepository.save(tipoItem);
	}
	
	// Actualizo un tipo de item
	public TipoItemEntity update(TipoItemEntity tipoItem) {
		return tipoItemRepository.save(tipoItem);
	}
	
	// Elimino un tipo de item
	public void delete(Integer id) {
		tipoItemRepository.deleteById(id);
	}
}
