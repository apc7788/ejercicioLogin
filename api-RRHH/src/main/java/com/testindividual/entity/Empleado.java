package com.testindividual.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id; // PK
	
	@Column(nullable=false, unique=true)
	private int dni; // UQ1
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private double salario;
	
	@Column(nullable=false)
	private int telefono;
	
	@Column(nullable=false)
	private int iddep; 

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getIdDep() {
		return iddep;
	}

	public void setIdDep(int idDep) {
		this.iddep = idDep;
	}
	
}
