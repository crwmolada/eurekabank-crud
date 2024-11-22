package com.pe.certus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Indica que es una entidad de Java Persistence API (los objetos de esta clase se pueden persistir en la base de datos)
@Table(name = "cliente") //Indica el nombre de la tabla en la base de datos
public class Cliente {
	
	@Id //Indica que es el identificador de la entidad
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Indica que el identificador se genera automáticamente
	@Column(name = "chr_cliecodigo") //Indica el nombre de la columna en la base de datos
	private Long id; //Atributo que representa el identificador del cliente
	
	@Column(name = "vch_cliepaterno")
	private String paterno;
	
	@Column(name = "vch_cliematerno")
	private String materno;
	
	@Column(name = "vch_clienombre")
	private String nombres;
	
	@Column(name = "chr_cliedni")
	private String dni;
	
	@Column(name = "vch_clieciudad")
	private String ciudad;
	
	@Column(name = "vch_clieemail")
	private String correo;
	
	@Column(name = "vch_clieestado")
	private Boolean estado;
	

	public Cliente() { //Constructor por defecto requerido por JPA
		super();
	}

	//Constructor con todos los campos
	public Cliente(Long id, String paterno, String materno, String nombres, String dni, String ciudad, String correo,
			Boolean estado) {
		super();
		this.id = id;
		this.paterno = paterno;
		this.materno = materno;
		this.nombres = nombres;
		this.dni = dni;
		this.ciudad = ciudad;
		this.correo = correo;
		this.estado = estado;
	}
	
	//Getters y Setters para los atributos de la clase
	//Getters: Obtienen el valor de un atributo
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPaterno() {
		return paterno;
	}


	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}


	public String getMaterno() {
		return materno;
	}


	public void setMaterno(String materno) {
		this.materno = materno;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getDni() {
		return dni;
	}

	//Setters: Asignan un valor a un atributo
	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	@Override //Indica que es un método de la clase
	public String toString() {  //Método que devuelve una representación en cadena de caracteres del objeto
		return "Cliente{" + "id=" + id + 
				", paterno='" + paterno + '\'' + 
				", materno='" + materno + '\'' + 
				", nombres='" + nombres + '\'' + 
				", dni='" + dni + '\'' + 
				", ciudad='" + ciudad + '\'' + 
				", correo='" + correo + '\'' + 
				", estado=" + estado + '}';
	}
	
}
