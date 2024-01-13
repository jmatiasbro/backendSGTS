package Backend.SGTS.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "estado", schema = "sgts_db", catalog = "")
public class EstadoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_Estado", nullable = false)
    private Integer idEstado;
    @Basic
    @Column(name = "Tipo_Estado", nullable = false, length = 45)
    private String tipoEstado;

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoEntity that = (EstadoEntity) o;
        return idEstado == that.idEstado && Objects.equals(tipoEstado, that.tipoEstado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstado, tipoEstado);
    }
}
