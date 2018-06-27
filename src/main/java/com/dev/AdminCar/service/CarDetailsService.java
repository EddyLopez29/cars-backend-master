package com.dev.AdminCar.service;

import java.util.List;

import com.dev.AdminCar.DAO.CarDetails;

public interface CarDetailsService {
	
	public CarDetails carDetailsbyId(Long id);
	
	public List<CarDetails> allKilometers();
	
}
