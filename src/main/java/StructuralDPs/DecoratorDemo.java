package StructuralDPs;

public class DecoratorDemo {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription()+"=> $"+coffee.getCost());

        //add milk
        coffee=new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+"=>$" +coffee.getCost());
    }
}
