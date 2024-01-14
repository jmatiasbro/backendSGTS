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

import Backend.SGTS.Entity.TipoItemEntity;
import Backend.SGTS.Service.TipoItemService;

@RestController
@RequestMapping("/tipoItem")
public class TipoItemController {

	// Inyecto Servicio de TipoItem
	@Autowired
	TipoItemService tipoItemService;
	
	// Obtengo todos los tipoItems
	@GetMapping("/getAll")
	public List<TipoItemEntity> getAll() {
		return tipoItemService.getAll();
	}
	
	// Obtengo un tipoItem por id
	@GetMapping("/{id}")
	public TipoItemEntity getById(@PathVariable Integer id) {
		return tipoItemService.getById(id);
	}
	
	// Creo un tipoItem
	@PostMapping("/create")
	public TipoItemEntity create(@RequestBody TipoItemEntity tipoItem) {
		return tipoItemService.create(tipoItem);
	}
	
	// Actualizo un tipoItem
	@PutMapping("/update/{id}")
	public TipoItemEntity update(@PathVariable("id") Integer id, @RequestBody TipoItemEntity tipoItem) {

		TipoItemEntity upDateTipoItem = tipoItemService.getById(id);

		upDateTipoItem.setTipoItem(tipoItem.getTipoItem());

		tipoItemService.update(upDateTipoItem);
		return upDateTipoItem;
	}
	
	// Elimino un tipoItem
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		tipoItemService.delete(id);
	}
}
