package com.testindividual.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testindividual.entity.Jefe;

@Repository
public interface JefeDao extends CrudRepository<Jefe, Long>{

}
