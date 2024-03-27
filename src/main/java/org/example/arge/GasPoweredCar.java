package org.example.arge;

public class GasPoweredCar extends CarSkeleton{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double vgKmPerLitre, int cylinders) {
        this.avgKmPerLitre = vgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String name, String description, double vgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = vgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}
