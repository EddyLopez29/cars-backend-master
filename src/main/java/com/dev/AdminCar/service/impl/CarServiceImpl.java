package com.dev.AdminCar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.AdminCar.DAO.Car;
import com.dev.AdminCar.repository.CarRepository;
import com.dev.AdminCar.service.CarService;

@Service
public class CarServiceImpl implements CarService {	
	
	@Autowired
	private CarRepository carRepository;
	
	public Car findById(long id) {
		return carRepository.carById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Car> allCars() {
		return (List<Car>) this.carRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Car carById(Long id) {
		return (Car) this.carRepository.carById(id);
	}

	@Override
	public List<Car> allModels() {
		return (List<Car>) this.carRepository.findAllModels();
	}	
}
