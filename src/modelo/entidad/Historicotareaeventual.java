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
 * Historicotareaeventual generated by hbm2java
 */
@Entity
@Table(name = "historicotareaeventual", schema = "public")
public class Historicotareaeventual implements java.io.Serializable {

	private int id;
	private Tareaeventual tareaeventual;
	private String razon;
	private Date fechainicio;
	private Date fechafin;
	private Date fechaculminado;

	public Historicotareaeventual() {
	}

	public Historicotareaeventual(int id) {
		this.id = id;
	}

	public Historicotareaeventual(int id, Tareaeventual tareaeventual,
			String razon, Date fechainicio, Date fechafin, Date fechaculminado) {
		this.id = id;
		this.tareaeventual = tareaeventual;
		this.razon = razon;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.fechaculminado = fechaculminado;
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
	@JoinColumn(name = "id_tareaeventual")
	public Tareaeventual getTareaeventual() {
		return this.tareaeventual;
	}

	public void setTareaeventual(Tareaeventual tareaeventual) {
		this.tareaeventual = tareaeventual;
	}

	@Column(name = "razon")
	public String getRazon() {
		return this.razon;
	}

	public void setRazon(String razon) {
		this.razon = razon;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechainicio", length = 29)
	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechafin", length = 29)
	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaculminado", length = 29)
	public Date getFechaculminado() {
		return this.fechaculminado;
	}

	public void setFechaculminado(Date fechaculminado) {
		this.fechaculminado = fechaculminado;
	}

}