package modelo.entidad;

// Generated 25/02/2015 09:17:21 AM by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UsuarioCargo generated by hbm2java
 */
@Entity
@Table(name = "usuario_cargo", schema = "public")
public class UsuarioCargo implements java.io.Serializable {

	private UsuarioCargoId id;
	private Cargo cargo;
	private Usuario usuario;

	public UsuarioCargo() {
	}

	public UsuarioCargo(UsuarioCargoId id, Cargo cargo, Usuario usuario) {
		this.id = id;
		this.cargo = cargo;
		this.usuario = usuario;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCargo", column = @Column(name = "id_cargo", nullable = false)),
			@AttributeOverride(name = "idUsuario", column = @Column(name = "id_usuario", nullable = false)) })
	public UsuarioCargoId getId() {
		return this.id;
	}

	public void setId(UsuarioCargoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cargo", nullable = false, insertable = false, updatable = false)
	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", nullable = false, insertable = false, updatable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}