package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Empleado;
import com.example.demo.dto.Trabajo;

/**
 * 
 * @author Alberto
 *
 */
@Repository
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {
	
//	//Listar empleados por campo nombre
	public List<Empleado> findByNombre(String nombre);
	
	//Listas empleados por campo Trabajo
	 List<Empleado> findByTrabajo(Trabajo trabajo);

}

