package modelo.entidad;

// Generated 25/02/2015 09:17:21 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Empresa generated by hbm2java
 */
@Entity
@Table(name = "empresa", schema = "public")
public class Empresa implements java.io.Serializable {

	private int id;
	private String nombre;
	private String rif;
	private String twitter;
	private String logo;
	private Set<Cargo> cargos = new HashSet<Cargo>(0);
	private Set<UsuarioEmpresa> usuarioEmpresas = new HashSet<UsuarioEmpresa>(0);

	public Empresa() {
	}

	public Empresa(int id) {
		this.id = id;
	}

	public Empresa(int id, String nombre, String rif, String twitter,
			String logo, Set<Cargo> cargos, Set<UsuarioEmpresa> usuarioEmpresas) {
		this.id = id;
		this.nombre = nombre;
		this.rif = rif;
		this.twitter = twitter;
		this.logo = logo;
		this.cargos = cargos;
		this.usuarioEmpresas = usuarioEmpresas;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "rif")
	public String getRif() {
		return this.rif;
	}

	public void setRif(String rif) {
		this.rif = rif;
	}

	@Column(name = "twitter")
	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Column(name = "logo")
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
	public Set<Cargo> getCargos() {
		return this.cargos;
	}

	public void setCargos(Set<Cargo> cargos) {
		this.cargos = cargos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
	public Set<UsuarioEmpresa> getUsuarioEmpresas() {
		return this.usuarioEmpresas;
	}

	public void setUsuarioEmpresas(Set<UsuarioEmpresa> usuarioEmpresas) {
		this.usuarioEmpresas = usuarioEmpresas;
	}

}
