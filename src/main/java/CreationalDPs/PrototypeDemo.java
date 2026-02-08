package CreationalDPs;

public class PrototypeDemo {
    public static void main(String[] args) {
        Car sportsCarPrototype = new Car("maruti","Ertiga","Red",100);
        Car car1 = sportsCarPrototype.clone();
        Car car2 = sportsCarPrototype.clone();

        car1.setColour("Blue");
        car2.setColour("Black");

        System.out.println("Prototype" + sportsCarPrototype);
        System.out.println("Car1 cloning" + car1);
        System.out.println("Car2 cloning" + car2);
    }
}
