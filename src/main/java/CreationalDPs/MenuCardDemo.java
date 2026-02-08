package CreationalDPs;

public class MenuCardDemo {
    public static void main(String[] args) {
        MenuItem burger = new MenuItem.Builder("Burger",150.00)
                .addCheese(true)
                .addDesert(true)
                .addDrink(true)
                .setSpiceLevel(3)
                .build();

        System.out.println(burger);
    }
}
