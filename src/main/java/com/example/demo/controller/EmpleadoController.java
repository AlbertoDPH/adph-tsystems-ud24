package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImple;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImple empleadoServiceImple;

	// Lista los empleados
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoServiceImple.listarEmpleados();
	}

	// Lista empleados por nombre
//	@GetMapping("/empleados/nombre/{nombre}")
//	public List<Empleado> listarEmpleadoNombre(@PathVariable(name = "nombre") String nombre) {
//		return empleadoServiceImple.listarEmpleadoNombre(nombre);
//
//	}

	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImple.guardarEmpleado(empleado);
	}

	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name = "id") Long id) {

		Empleado empleado_xid = new Empleado();

		empleado_xid = empleadoServiceImple.empleadoXID(id);

		System.out.println("empleado XID: " + empleado_xid);

		return empleado_xid;
	}

	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") Long id, @RequestBody Empleado empleado) {

		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();

		empleado_seleccionado = empleadoServiceImple.empleadoXID(id);

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setTrabajo(empleado.getTrabajo());
		empleado_seleccionado.setSalario(empleado.getSalario());
		
		empleado_actualizado = empleadoServiceImple.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: " + empleado_actualizado);

		return empleado_actualizado;

	}

	@DeleteMapping("/empleados/{id}")
	public void eliminarCliente(@PathVariable(name = "id") Long id) {
		empleadoServiceImple.eliminarEmpleado(id);
	}

}
