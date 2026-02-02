package CreationalDPs;

//concrete class
public class VanDelivery implements Delivery{

    @Override
    public void deliver() {
        System.out.println("Delivery by van");
    }
}
