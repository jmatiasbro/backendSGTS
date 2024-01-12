package Backend.SGTS.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "servicio_empresa", schema = "sgts_db", catalog = "")
public class ServicioEmpresaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_Servicio_Empresa", nullable = false)
    private int idServicioEmpresa;
    @Basic
    @Column(name = "Costo_Servicio", nullable = false, precision = 0)
    private double costoServicio;
    @Basic
    @Column(name = "Servicio_id_Servicio", nullable = false)
    private int servicioIdServicio;
    @Basic
    @Column(name = "Empresa_id_Empresa", nullable = false)
    private int empresaIdEmpresa;
    @Basic
    @Column(name = "Recurso_GG_id_Recurso_GG", nullable = false)
    private int recursoGgIdRecursoGg;
    @Basic
    @Column(name = "Elinimado", nullable = true)
    private Byte elinimado;

    public int getIdServicioEmpresa() {
        return idServicioEmpresa;
    }

    public void setIdServicioEmpresa(int idServicioEmpresa) {
        this.idServicioEmpresa = idServicioEmpresa;
    }

    public double getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(double costoServicio) {
        this.costoServicio = costoServicio;
    }

    public int getServicioIdServicio() {
        return servicioIdServicio;
    }

    public void setServicioIdServicio(int servicioIdServicio) {
        this.servicioIdServicio = servicioIdServicio;
    }

    public int getEmpresaIdEmpresa() {
        return empresaIdEmpresa;
    }

    public void setEmpresaIdEmpresa(int empresaIdEmpresa) {
        this.empresaIdEmpresa = empresaIdEmpresa;
    }

    public int getRecursoGgIdRecursoGg() {
        return recursoGgIdRecursoGg;
    }

    public void setRecursoGgIdRecursoGg(int recursoGgIdRecursoGg) {
        this.recursoGgIdRecursoGg = recursoGgIdRecursoGg;
    }

    public Byte getElinimado() {
        return elinimado;
    }

    public void setElinimado(Byte elinimado) {
        this.elinimado = elinimado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicioEmpresaEntity that = (ServicioEmpresaEntity) o;
        return idServicioEmpresa == that.idServicioEmpresa && Double.compare(costoServicio, that.costoServicio) == 0 && servicioIdServicio == that.servicioIdServicio && empresaIdEmpresa == that.empresaIdEmpresa && recursoGgIdRecursoGg == that.recursoGgIdRecursoGg && Objects.equals(elinimado, that.elinimado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idServicioEmpresa, costoServicio, servicioIdServicio, empresaIdEmpresa, recursoGgIdRecursoGg, elinimado);
    }
}
