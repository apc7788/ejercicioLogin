package com.testindividual.service;

import java.util.List;

import com.testindividual.entity.Jefe;

public interface JefeServiceInter {

	//GUARDAR EN ARRAYLIST EL Jefe
	public List<Jefe> findAll();
		
	//BUSCAR ID
	public Jefe findById(Long id);
		
	//BORAR Jefe
	public void delete (Long id);
		
	//GUARDAR Jefe PARA ACTUALIZAR
	public Jefe save(Jefe jefe);
}
