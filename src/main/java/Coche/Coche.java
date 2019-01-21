package Coche;

import java.util.Date;

public class Coche {
	private Integer id;
	private String marca;
	private String matricula;
	private Date fechaMatricula;
	private Integer idPropietario;

	public Coche() {
		super();

	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", matricula=" + matricula + ", dechaMatricula="
				+ fechaMatricula + ", idPropietario=" + idPropietario + "]";
	}

	public Coche(Integer id, String marca, String matricula, Date dechaMatricula, Integer idPropietario) {
		super();
		this.id = id;
		this.marca = marca;
		this.matricula = matricula;
		this.fechaMatricula = fechaMatricula;
		this.idPropietario = idPropietario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(Date dechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Integer getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(Integer idPropietario) {
		this.idPropietario = idPropietario;
	}
}
