package modelo.entidad;

// Generated 25/02/2015 09:17:21 AM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsuarioCargoId generated by hbm2java
 */
@Embeddable
public class UsuarioCargoId implements java.io.Serializable {

	private int idCargo;
	private int idUsuario;

	public UsuarioCargoId() {
	}

	public UsuarioCargoId(int idCargo, int idUsuario) {
		this.idCargo = idCargo;
		this.idUsuario = idUsuario;
	}

	@Column(name = "id_cargo", nullable = false)
	public int getIdCargo() {
		return this.idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	@Column(name = "id_usuario", nullable = false)
	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UsuarioCargoId))
			return false;
		UsuarioCargoId castOther = (UsuarioCargoId) other;

		return (this.getIdCargo() == castOther.getIdCargo())
				&& (this.getIdUsuario() == castOther.getIdUsuario());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCargo();
		result = 37 * result + this.getIdUsuario();
		return result;
	}

}
