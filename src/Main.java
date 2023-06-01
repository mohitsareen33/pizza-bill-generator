public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
//        System.out.println(basePizza.getPrice());
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.getBill();

        DeluxePizza specialPizza = new DeluxePizza(false);
        specialPizza.addExtraCheese();
        specialPizza.getBill();
    }
}