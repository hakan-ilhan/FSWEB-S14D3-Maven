package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        simpleName();
        return  "Mitsubishi is braking.";
    }

    @Override
    public String accelerate() {
        simpleName();
        return "Mitsubishi is accelerating.";
    }

    @Override
    public String startEngine() {
        simpleName();
        return "Mitsubishi's engine is starting.";
    }
}
