package Backend.SGTS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.SGTS.Entity.EmpresaEntity;
import Backend.SGTS.Repository.EmpresaRepository;

@Service
public class EmpresaService {

	// Inyecto repositorio
	@Autowired
	EmpresaRepository empresaRepository;
	
	// Obtengo todos los riesgos
	public List<EmpresaEntity> getAll() {
		return empresaRepository.findAll();
	}
	
	// Obtengo un riesgo por id
	public EmpresaEntity getById(Integer id) {
		return empresaRepository.findById(id).orElse(null);
	}
	
	// Creo un riesgo
	public EmpresaEntity create(EmpresaEntity empresa) {
		return empresaRepository.save(empresa);
	}
	
	// Actualizo un riesgo
	public EmpresaEntity update(EmpresaEntity empresa) {
		return empresaRepository.save(empresa);
	}
	
	// Elimino un riesgo
	public void delete(Integer id) {
		empresaRepository.deleteById(id);
	}
}
