package CreationalDPs;

public class MenuItem {
    private String name;
    private double price;
    private boolean cheese;
    private boolean drink;
    private boolean dessert;
    private  int spiceLevel;

    public MenuItem(Builder builder){
        this.name=builder.name;
        this.price=builder.price;
        this.cheese=builder.cheese;
        this.drink=builder.drink;
        this.dessert=builder.dessert;
        this.spiceLevel=builder.spicelevel;
    }

    public static class Builder{
        private String name;
        private double price;
        private boolean cheese;
        private boolean drink;
        private boolean dessert;
        private int spicelevel;

        public Builder(String name,double price){
            this.name=name;
            this.price=price;
        }

        public Builder addCheese(boolean cheese){
            this.cheese=cheese;
            return this;
        }

        public Builder addDrink(boolean drink){
            this.drink=drink;
            return this;
        }

        public Builder addDesert(boolean dessert){
            this.dessert=dessert;
            return this;
        }

        public Builder setSpiceLevel(int spiceLevel){
            this.spicelevel = spiceLevel;
            return this;
        }

        public MenuItem build(){
            return new MenuItem(this);
        }
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cheese=" + cheese +
                ", drink=" + drink +
                ", dessert=" + dessert +
                ", spiceLevel=" + spiceLevel +
                '}';
    }
}
