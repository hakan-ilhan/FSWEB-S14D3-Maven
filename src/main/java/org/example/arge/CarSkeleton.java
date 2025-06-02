package org.example.arge;

import org.example.company.Car;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Engine starting.");
    }


    public void drive(){
        System.out.println(name + " is driving.");
    }


    public void runEngine(CarSkeleton car){

        if(car instanceof ElectricCar){
            double avgKmPerCharge = ((ElectricCar) car).getAvgKmPerCharge();
            int cylinders = ((ElectricCar) car).getBatterySize();

            System.out.println("The car engine starting with electric. Per charge: "+avgKmPerCharge + " batterry size: " + ((ElectricCar) car).getBatterySize() + "name :" + car.getName() + "ddescription: " + getDescription());
        
        } else if (car instanceof HybridCar) {
            HybridCar hybridCar = ((HybridCar) car);

            System.out.println("The car engine is starting with hybrid. Per charge: " + hybridCar.getAvgKmPerLiter() + " battery size: " + hybridCar.getBatterySize() + " cylinder: " + hybridCar.getCylinders());

        } else if (car instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) car;

            System.out.println("The car engine is starting with gaspowered car: per charge: " + gasPoweredCar.getAvgKmPerLitre());
        } else {
            System.out.println("invalid car type!");
        }





    }
}
