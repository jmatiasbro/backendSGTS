package Backend.SGTS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Dto.EmpresaDto;
import Backend.SGTS.Entity.EmpresaEntity;

@Repository
public interface EmpresaDtoRepository extends CrudRepository<EmpresaEntity, Integer> {
/*
	@Query("SELECT new Backend.SGTS.Dto.EmpresaDto(e.razonSocial, e.cuit, e.direccion, ru.rubro, ri.riesgo) " +
            "FROM EmpresaEntity e " +
            "JOIN RubroEntity ru ON ru.idRubro = e.rubro.idRubro " +
            "JOIN RiesgoEntity ri ON ri.idRiesgo = e.riesgo.idRiesgo")
    List<EmpresaDto> obtenerEmpresasDto();*/
}
