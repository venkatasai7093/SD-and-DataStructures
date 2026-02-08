package StructuralDPs;

public class ProxyDemo {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("car.jpeg");
        Image img2= new ProxyImage("truck.jpeg");

        img1.display();
        img1.display();

        img2.display();
    }
}
