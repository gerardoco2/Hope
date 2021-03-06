package modelo.entidad;

// Generated 25/02/2015 09:17:21 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Solicitud generated by hbm2java
 */
@Entity
@Table(name = "solicitud", schema = "public")
public class Solicitud implements java.io.Serializable {

	private int id;
	private Cargo cargo;
	private Usuario usuario;
	private String descripcion;
	private Date fechasolicitud;
	private Date fecharevision;
	private Integer estatus;

	public Solicitud() {
	}

	public Solicitud(int id) {
		this.id = id;
	}

	public Solicitud(int id, Cargo cargo, Usuario usuario, String descripcion,
			Date fechasolicitud, Date fecharevision, Integer estatus) {
		this.id = id;
		this.cargo = cargo;
		this.usuario = usuario;
		this.descripcion = descripcion;
		this.fechasolicitud = fechasolicitud;
		this.fecharevision = fecharevision;
		this.estatus = estatus;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cargoresponsable")
	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuariosolicitante")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechasolicitud", length = 29)
	public Date getFechasolicitud() {
		return this.fechasolicitud;
	}

	public void setFechasolicitud(Date fechasolicitud) {
		this.fechasolicitud = fechasolicitud;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecharevision", length = 29)
	public Date getFecharevision() {
		return this.fecharevision;
	}

	public void setFecharevision(Date fecharevision) {
		this.fecharevision = fecharevision;
	}

	@Column(name = "estatus")
	public Integer getEstatus() {
		return this.estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

}
