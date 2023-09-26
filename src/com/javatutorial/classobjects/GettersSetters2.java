package com.javatutorial.classobjects;

public class GettersSetters2 {

	public static void main(String[] args) {
		Car babluCar = new Car();
		babluCar.setCarNumber(123);
		babluCar.setCarBrand("Hyundai");
		babluCar.setCarModel("i20");
		babluCar.setFuelType("Petrol");
		
		System.out.println(babluCar.getCarBrand());
	}

}
