package Backend.SGTS.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "item", schema = "sgts_db", catalog = "")
public class ItemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_Item", nullable = false)
    private int idItem;
    @Basic
    @Column(name = "Descripcion", nullable = false, length = 60)
    private String descripcion;
    @Basic
    @Column(name = "Tipo_Item_id_Tipo_Item", nullable = false)
    private int tipoItemIdTipoItem;
    @Basic
    @Column(name = "Rubro_id_Rubro", nullable = true)
    private Integer rubroIdRubro;
    @Basic
    @Column(name = "Dependencia_id_Dependencia", nullable = true)
    private Integer dependenciaIdDependencia;
    @Basic
    @Column(name = "Tipo_Servicio_id_Tipo_Servicio", nullable = false)
    private int tipoServicioIdTipoServicio;

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipoItemIdTipoItem() {
        return tipoItemIdTipoItem;
    }

    public void setTipoItemIdTipoItem(int tipoItemIdTipoItem) {
        this.tipoItemIdTipoItem = tipoItemIdTipoItem;
    }

    public Integer getRubroIdRubro() {
        return rubroIdRubro;
    }

    public void setRubroIdRubro(Integer rubroIdRubro) {
        this.rubroIdRubro = rubroIdRubro;
    }

    public Integer getDependenciaIdDependencia() {
        return dependenciaIdDependencia;
    }

    public void setDependenciaIdDependencia(Integer dependenciaIdDependencia) {
        this.dependenciaIdDependencia = dependenciaIdDependencia;
    }

    public int getTipoServicioIdTipoServicio() {
        return tipoServicioIdTipoServicio;
    }

    public void setTipoServicioIdTipoServicio(int tipoServicioIdTipoServicio) {
        this.tipoServicioIdTipoServicio = tipoServicioIdTipoServicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemEntity that = (ItemEntity) o;
        return idItem == that.idItem && tipoItemIdTipoItem == that.tipoItemIdTipoItem && tipoServicioIdTipoServicio == that.tipoServicioIdTipoServicio && Objects.equals(descripcion, that.descripcion) && Objects.equals(rubroIdRubro, that.rubroIdRubro) && Objects.equals(dependenciaIdDependencia, that.dependenciaIdDependencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItem, descripcion, tipoItemIdTipoItem, rubroIdRubro, dependenciaIdDependencia, tipoServicioIdTipoServicio);
    }
}
