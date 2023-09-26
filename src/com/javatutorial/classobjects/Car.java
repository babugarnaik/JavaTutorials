package com.javatutorial.classobjects;

import java.util.ArrayList;

import com.javatutorial.arrays.ArrayDec;

public class Car {
	
	int carNumber;
	String carBrand;
	String carModel;
	String fuelType;
	
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	
	public int getCarNumber() {
		return this.carNumber;
	}
	
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	
	public String getCarBrand() {
		return this.carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	

}
