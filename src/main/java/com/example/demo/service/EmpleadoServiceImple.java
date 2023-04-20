package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;
import com.example.demo.dto.Trabajo;

/**
 * 
 * @author Alberto
 *
 */
@Service
public class EmpleadoServiceImple implements IEmpleadoService {

	// Utilizamos los metodos de la interface IEmpleadoDAO, es como si
	// instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	@Override
	public List<Empleado> listarEmpleados() {

		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {

		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(Long id) {

		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public List<Empleado> listarEmpleadoNombre(String nombre) {

		return iEmpleadoDAO.findByNombre(nombre);

	}
	
	@Override
	public List<Empleado> listarEmpleadoPorTrabajo(Trabajo trabajo) {
		List<Empleado> empleados = iEmpleadoDAO.findByTrabajo(trabajo);
	    for (Empleado empleado : empleados) {
	        empleado.setSalario(trabajo.getSalario());
	    }
	    return empleados;
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {

		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {

		iEmpleadoDAO.deleteById(id);

	}

}
