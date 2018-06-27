package com.dev.AdminCar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dev.AdminCar.DAO.Car;
import com.dev.AdminCar.DAO.CarDetails;
import com.dev.AdminCar.service.CarDetailsService;
import com.dev.AdminCar.service.CarService;

@RestController
@SuppressWarnings("rawtypes")
public class CarRestController {

	
	@GetMapping("/cars")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Car> listAllCars(){
		return carService.allCars();
	}
	
	@GetMapping("/cars/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Car showCars(@PathVariable Long id){
		return carService.carById(id);
	}
	
	 
	 @GetMapping("/carDetails/{id}")
	 @ResponseStatus(HttpStatus.CREATED)
	 public CarDetails showDetails(@PathVariable Long id){
		 return carDetailsService.carDetailsbyId(id);
	 }
	 
	 @GetMapping("/carModels")
	 @ResponseStatus(HttpStatus.CREATED)
	 public List<Car> listAllModels(){
		 return carService.allModels();
	 }
	 
	 @GetMapping("/carKilometers")
	 @ResponseStatus(HttpStatus.CREATED)
	 public List<CarDetails> listAllKilometers(){
		 return carDetailsService.allKilometers();
	 }
	
	 
	@Autowired
	private CarService carService;
	
	@Autowired
	private CarDetailsService carDetailsService;
		
}