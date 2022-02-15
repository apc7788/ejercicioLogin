package com.testindividual.service;

import java.util.List;

import com.testindividual.entity.Departamento;

public interface DepartamentoServiceInter {

	//GUARDAR EN ARRAYLIST EL Departamento
	public List<Departamento> findAll();
		
	//BUSCAR ID
	public Departamento findById(Long id);
		
	//BORAR Departamento
	public void delete (Long id);
		
	//GUARDAR Departamento PARA ACTUALIZAR
	public Departamento save(Departamento departamento);
}
