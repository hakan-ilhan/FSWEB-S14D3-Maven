package org.example.arge;

import org.example.company.Car;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;



    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine(){
        System.out.printf("Electric car(%s) is starting.%n",getName());
    }

    
}
