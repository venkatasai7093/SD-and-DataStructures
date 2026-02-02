package CreationalDPs;

public class DeliveryFactory {
    public static Delivery getDelivery(String type){
        switch (type){
            case "Van":return new VanDelivery();
            case "Bike":return new BikeDelivery();
            default:throw new IllegalArgumentException("Unknown Delivery");
        }
    }
}
