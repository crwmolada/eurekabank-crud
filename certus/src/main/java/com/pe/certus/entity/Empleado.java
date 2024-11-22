package com.pe.certus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chr_emplcodigo")
    private Long id;
    
    @Column(name = "vch_emplpaterno")
    private String paterno;
    
    @Column(name = "vch_emplmaterno")
    private String materno;
    
    @Column(name = "vch_emplnombre")
    private String nombre;
    
    @Column(name = "vch_emplusuario")
    private String usuario;
    
    @Column(name = "vch_emplclave")
    private String clave;
    
    @Column(name = "chr_emplestado")
    private Boolean estado;

    public Empleado() {
    }

    public Empleado(Long id, String paterno, String materno, String nombre, String usuario, String clave, Boolean estado) {
        super();
        this.id = id;
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", paterno='" + paterno + '\'' +
                ", materno='" + materno + '\'' +
                ", nombre='" + nombre + '\'' +
                ", usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    } 

}
                   