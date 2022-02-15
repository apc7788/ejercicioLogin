package com.testindividual.service;

import java.util.List;

import com.testindividual.entity.Empleado;

public interface EmpleadoServiceInter {

	//GUARDAR EN ARRAYLIST EL Empleado
	public List<Empleado> findAll();
		
	//BUSCAR ID
	public Empleado findById(Long id);
		
	//BORAR Empleado
	public void delete (Long id);
		
	//GUARDAR Empleado PARA ACTUALIZAR
	public Empleado save(Empleado empleado);
}
