package StructuralDPs;

public class Honda implements Bike{

    private final String brand;
    private final String model;
    private final int engineCC;

    public Honda(String model, int engineCC) {
        this.brand = "Honda";
        this.model = model;
        this.engineCC = engineCC;
    }

    @Override
    public void ride(String numberPlate, String location) {
        System.out.println("Riding"+brand+" "+model+"("+engineCC+"cc)"+ "with number plate"+numberPlate+"at"+location);
    }
}
