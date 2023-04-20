package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;
import com.example.demo.dto.Trabajo;

/**
 * 
 * @author Alberto
 *
 */
public interface IEmpleadoService {

	// Metodos del CRUD
	public List<Empleado> listarEmpleados(); // Listar All

	public Empleado guardarEmpleado(Empleado empleado); // Guarda un empleado CREATE

	public Empleado empleadoXID(Long id); // Leer datos de un empleado READ

	public List<Empleado> listarEmpleadoNombre(String nombre);// Listar Empleadopor campo nombre

	public Empleado actualizarEmpleado(Empleado empleado); // Actualiza datos del empleado UPDATE

	public void eliminarEmpleado(Long id);// Elimina el empleado DELETE

	List<Empleado> listarEmpleadoPorTrabajo(Trabajo trabajo);

}
