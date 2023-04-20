package com.example.demo.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado") // en el caso de que la tabla se escriba diferente
public class Empleado {

	// Atributos de la clase empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca el ultimo valor e incrementa desde el id final de db
	private Long id;
	@Column(name = "nombre") // no hace falta si se llaman igual
	private String nombre;
	@Enumerated(EnumType.STRING)
	private Trabajo trabajo;
	
	@JsonSerialize
	@Column(name = "salario")
	private Double salario;

	// Constructores

	public Empleado() {

	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Empleado(Long id, String nombre, Trabajo trabajo, Double salario) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	}
	// Getters y Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}

}
