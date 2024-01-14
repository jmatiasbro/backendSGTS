package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.ItemEntity;
import Backend.SGTS.Repository.ItemRepository;

@Service
public class ItemService {

	// Inyecto repositorio
	@Autowired
	ItemRepository itemRepository;
	
	// Obtengo todos los items
	public List<ItemEntity> getAll() {
		return itemRepository.findAll();
	}
	
	// Obtengo un item por id
	public ItemEntity getById(Integer id) {
		return itemRepository.findById(id).orElse(null);
	}
	
	// Creo un item
	public ItemEntity create(ItemEntity item) {
		return itemRepository.save(item);
	}
	
	// Actualizo un item
	public ItemEntity update(ItemEntity item) {
		return itemRepository.save(item);
	}
	
	// Elimino un item
	public void delete(Integer id) {
		itemRepository.deleteById(id);
	}
}
