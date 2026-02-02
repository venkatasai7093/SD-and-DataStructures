package CreationalDPs;

public class FactoryMain {
    public static void main(String[] args) {
        Delivery d1 = DeliveryFactory.getDelivery("Van");
        d1.deliver();
    }
}
