package Backend.SGTS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Backend.SGTS.Entity.ContactoEmpresaEntity;

@Repository
public interface ContactoEmpresaRepository extends JpaRepository<ContactoEmpresaEntity, Integer>{

}