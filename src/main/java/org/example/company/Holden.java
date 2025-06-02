package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        simpleName();
        return  "Holden is braking.";
    }

    @Override
    public String accelerate() {
        simpleName();
        return  "Holden is accelerating.";
    }

    @Override
    public String startEngine() {
        simpleName();
        return "Holden's engine is starting.";
    }
}
