package Backend.SGTS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Backend.SGTS.Repository.Dto.DtoRepositoryEmpresa;

@RestController
@RequestMapping("/empresaDto")
public class EmpresaDtoController {

	@Autowired
	DtoRepositoryEmpresa dtoRepositoryEmpresa;
	
	// Obtener los dto de empresas
	@RequestMapping("/getAll")
	public Object getAll() {
		return dtoRepositoryEmpresa.obtenerEmpresasDto();
	}
}
