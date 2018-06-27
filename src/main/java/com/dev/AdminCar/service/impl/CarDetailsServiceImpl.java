package com.dev.AdminCar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.AdminCar.DAO.CarDetails;
import com.dev.AdminCar.repository.CarDetailsRepository;
import com.dev.AdminCar.service.CarDetailsService;

@Service
public class CarDetailsServiceImpl implements CarDetailsService{

	@Autowired
	private CarDetailsRepository carDetailsRepository;
	
	@Override
	@Transactional(readOnly = true)
	public CarDetails carDetailsbyId(Long id) {
		return carDetailsRepository.carDetails(id);
	}

	@Override
	public List<CarDetails> allKilometers() {
		return (List <CarDetails>) this.carDetailsRepository.findAllKilometers();
	}


}
