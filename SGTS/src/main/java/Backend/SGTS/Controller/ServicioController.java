package Backend.SGTS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Backend.SGTS.Entity.ServicioEntity;
import Backend.SGTS.Service.ServicioService;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

	// Inyecto Servicio de Servicio
	@Autowired
	ServicioService servicioService;
	
	// Obtengo todos los servicios
	@GetMapping("/getAll")
	public List<ServicioEntity> getAll() {
		return servicioService.getAll();
	}
	
	// Obtengo un servicio por id
	@GetMapping("/{id}")
	public ServicioEntity getById(@PathVariable Integer id) {
		return servicioService.getById(id);
	}
	
	// Creo un servicio
	@PostMapping("/create")
	public ServicioEntity create(@RequestBody ServicioEntity servicio) {
		return servicioService.create(servicio);
	}
	
	// Actualizo un servicio
	@PutMapping("/update/{id}")
	public ServicioEntity update(@PathVariable("id") Integer id, @RequestBody ServicioEntity servicio) {

		ServicioEntity upDateServicio = servicioService.getById(id);
		upDateServicio.setFechaVencExpediente(servicio.getFechaVencExpediente());
		upDateServicio.setFechaHoraAlertaVenc(servicio.getFechaHoraAlertaVenc());
		upDateServicio.setRecurrencia(servicio.getRecurrencia());
		upDateServicio.setTipoServicioIdTipoServicio(servicio.getTipoServicioIdTipoServicio());
		upDateServicio.setReferenciaIdServicio(servicio.getReferenciaIdServicio());
		upDateServicio.setComentario(servicio.getComentario());
		upDateServicio.setExpediente(servicio.getExpediente());
		servicioService.update(upDateServicio);

		return upDateServicio;
	}
	
	/* Función anulada, no se puede borrar directamente un servicio */
	/*
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		servicioService.delete(id);
	}
	*/
}
