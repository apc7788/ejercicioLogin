package com.testindividual.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testindividual.entity.Departamento;

@Repository
public interface DepartamentoDao extends CrudRepository<Departamento, Long>{

	
}
