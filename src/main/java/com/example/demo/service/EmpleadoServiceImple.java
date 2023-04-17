package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

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

//	@Override
//	public List<Empleado> listarEmpleadoNombre(String nombre) {
//
//		return iEmpleadoDAO.buscarPorNombre(nombre);
//
//	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {

		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {

		iEmpleadoDAO.deleteById(id);

	}

}
