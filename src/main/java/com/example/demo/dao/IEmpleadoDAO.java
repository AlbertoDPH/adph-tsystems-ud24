package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Empleado;

/**
 * 
 * @author Alberto
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {
	
//	//Listar empleados por campo nombre
//	public List<Empleado> buscarPorNombre(String nombre);

}
