package com.dev.AdminCar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dev.AdminCar.DAO.CarDetails;

public interface CarDetailsRepository extends CrudRepository<CarDetails, Long> {
	
	@Query("FROM CarDetails WHERE id  = :id")
	CarDetails carDetails(@Param("id") Long  id);

	@Query("select kilometers From CarDetails")
	public List<CarDetails> findAllKilometers();
}
