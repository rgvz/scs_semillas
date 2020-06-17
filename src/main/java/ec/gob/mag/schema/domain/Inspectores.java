package ec.gob.mag.schema.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="inspectores")
public class Inspectores implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="inspectores_inspector_id_seq", sequenceName = "inspectores_inspector_id_seq")
	
	@Column(name= "inspector_id")
	private Long inspectorid;
	@Column(name= "inspector_cedula")
	private String inspectorcedula;
	@Column(name= "inspector_nombre")
	private String inspectornombre;
	@Column(name= "inspector_ubi_id")
	private Long inspectorubiid;
	@Column(name= "inspector_correo")
	private String inspectorcorreo;
	@Column(name= "inspector_telefono")
	private String inspectortelefono;
	@Column(name= "inspector_estado")
	private Boolean inspectorestado;
	
	
	
	
	public Long getInspectorid() {
		return inspectorid;
	}




	public void setInspectorid(Long inspectorid) {
		this.inspectorid = inspectorid;
	}




	public String getInspectorcedula() {
		return inspectorcedula;
	}




	public void setInspectorcedula(String inspectorcedula) {
		this.inspectorcedula = inspectorcedula;
	}




	public String getInspectornombre() {
		return inspectornombre;
	}




	public void setInspectornombre(String inspectornombre) {
		this.inspectornombre = inspectornombre;
	}




	public Long getInspectorubiid() {
		return inspectorubiid;
	}




	public void setInspectorubiid(Long inspectorubiid) {
		this.inspectorubiid = inspectorubiid;
	}




	public String getInspectorcorreo() {
		return inspectorcorreo;
	}




	public void setInspectorcorreo(String inspectorcorreo) {
		this.inspectorcorreo = inspectorcorreo;
	}




	public String getInspectortelefono() {
		return inspectortelefono;
	}




	public void setInspectortelefono(String inspectortelefono) {
		this.inspectortelefono = inspectortelefono;
	}




	public Boolean getInspectorestado() {
		return inspectorestado;
	}




	public void setInspectorestado(Boolean inspectorestado) {
		this.inspectorestado = inspectorestado;
	}




	private static final long serialVersionUID = 1L;

}
