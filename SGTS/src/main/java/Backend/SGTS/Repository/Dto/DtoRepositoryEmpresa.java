package Backend.SGTS.Repository.Dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Dto.EmpresaDto;

@Repository
public class DtoRepositoryEmpresa {

	@Autowired
    private JdbcTemplate jdbcTemplate;

    public List<EmpresaDto> obtenerEmpresasDto() {
        String sql = "SELECT e.Razon_Social AS empresa, e.Cuit AS cuit, e.Direccion AS direccion, " 
        		+"ru.Rubro AS rubro, ri.Riesgo AS riesgo " 
        		+"FROM empresa e " 
        		+"JOIN rubro ru ON ru.id_Rubro = e.Rubro_id_Rubro " 
        		+"JOIN riesgo ri ON ri.id_Riesgo = e.Riesgo_id_Riesgo ";

        return jdbcTemplate.query(sql, (resultSet, rowNum) -> {
            EmpresaDto empresaDto = new EmpresaDto();
            empresaDto.setEmpresa(resultSet.getString("empresa"));
            empresaDto.setCuit(resultSet.getString("cuit"));
            empresaDto.setDireccion(resultSet.getString("direccion"));
            empresaDto.setRubro(resultSet.getString("rubro"));
            empresaDto.setRiesgo(resultSet.getString("riesgo"));
            return empresaDto;
        });
    }
}
