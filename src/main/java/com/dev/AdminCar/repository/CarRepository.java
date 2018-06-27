package com.dev.AdminCar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dev.AdminCar.DAO.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
	
	@Query("FROM Car as c WHERE c.id = :id")
	Car carById(@Param("id") Long id);
	
	@Query("select model FROM Car")
	public List<Car> findAllModels();
}
