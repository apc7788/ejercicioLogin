package com.testindividual.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testindividual.entity.Empleado;

@Repository
public interface EmpleadoDao extends CrudRepository<Empleado, Long>{

}
