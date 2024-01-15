package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.ItemChecklistEntity;
import Backend.SGTS.Repository.ItemChecklistRepository;

@Service
public class ItemChecklistService {

	// Inyecto Repositorio de ItemChecklist
	@Autowired
	ItemChecklistRepository itemChecklistRepository;
	
	// Obtengo todos los items de checklist
	public List<ItemChecklistEntity> getAll() {
		return itemChecklistRepository.findAll();
	}
	
	// Obtengo un item de checklist por id
	public ItemChecklistEntity getById(Integer id) {
		return itemChecklistRepository.findById(id).orElse(null);
	}
	
	// Creo un item de checklist
	public ItemChecklistEntity create(ItemChecklistEntity itemChecklist) {
		return itemChecklistRepository.save(itemChecklist);
	}
	
	// Actualizo un item de checklist
	public ItemChecklistEntity update(ItemChecklistEntity itemChecklist) {
		return itemChecklistRepository.save(itemChecklist);
	}
	
	// Elimino un item de checklist
	public void delete(Integer id) {
		itemChecklistRepository.deleteById(id);
	}
}
