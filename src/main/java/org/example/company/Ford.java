package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        simpleName();
        return  "Ford is braking.";
    }

    @Override
    public String accelerate() {
        simpleName();
        return "Ford is accelerating.";
    }

    @Override
    public String startEngine() {
        simpleName();
        return  "Ford's engine is starting.";
    }
}
