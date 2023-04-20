package com.example.demo.dto;

public enum Trabajo {
	Programador(2000), Analista(3000), Soporte(1500);

	private final double salario;

	Trabajo(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
}
