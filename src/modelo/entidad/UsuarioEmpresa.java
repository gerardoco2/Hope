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
 * UsuarioEmpresa generated by hbm2java
 */
@Entity
@Table(name = "usuario_empresa", schema = "public")
public class UsuarioEmpresa implements java.io.Serializable {

	private UsuarioEmpresaId id;
	private Empresa empresa;
	private Usuario usuario;

	public UsuarioEmpresa() {
	}

	public UsuarioEmpresa(UsuarioEmpresaId id, Empresa empresa, Usuario usuario) {
		this.id = id;
		this.empresa = empresa;
		this.usuario = usuario;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idUsuario", column = @Column(name = "id_usuario", nullable = false)),
			@AttributeOverride(name = "idEmpresa", column = @Column(name = "id_empresa", nullable = false)) })
	public UsuarioEmpresaId getId() {
		return this.id;
	}

	public void setId(UsuarioEmpresaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_empresa", nullable = false, insertable = false, updatable = false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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
