package com.dev.AdminCar.service;

import java.util.List;

import com.dev.AdminCar.DAO.Car;

public interface CarService {
	
	public List<Car> allCars();
		
	public Car carById(Long id);
	
	public List<Car> allModels();
}
