package StructuralDPs;

public class FlyweightDemo {

    public static void main(String[] args) {
        Bike bike1 = BikeFactory.getBike("Shine",125);
        bike1.ride("KA-49943","Banglore");

        Bike bike2 = BikeFactory.getBike("Shine",125);
        bike1.ride("TN-63533","Chennai");

        Bike bike3 = BikeFactory.getBike("CBR",125);
        bike1.ride("MH-384989","Kolkata");
    }
}
