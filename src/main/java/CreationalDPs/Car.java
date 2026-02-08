package CreationalDPs;

public class Car implements Prototype{

    private String brand;
    private String model;
    private String colour;
    private int topSpeed;

    public Car(String brand, String model, String colour, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.topSpeed = topSpeed;
    }

    @Override
    public Car clone(){
        return new Car(this.brand,this.model,this.colour,this.topSpeed);
    }

    public void setColour(String colour){
        this.colour=colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
