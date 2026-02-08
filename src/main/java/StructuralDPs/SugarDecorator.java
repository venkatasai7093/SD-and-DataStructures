package StructuralDPs;

public class SugarDecorator extends CoffeeDecorator {


    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return super.getDescription()+"Milk";
    }

    @Override
    public double getCost(){
        return super.getCost()+2.0;
    }
}
