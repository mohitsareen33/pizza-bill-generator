public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheeseadded = 100;
    private boolean hasExtraCheeseAdded = false;

    private int extraToppingsadded = 150;
    private boolean hasExtraToppingsAdded = false;

    private int takeAway = 20;
    private boolean optedTakeAway = false;

    public Pizza(boolean veg) {
        if(veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
    }

    public void addExtraCheese(){
        this.price += extraCheeseadded;
        hasExtraCheeseAdded = true;
    }

    public void addExtraToppings(){
        this.price += extraToppingsadded;
        hasExtraToppingsAdded = true;
    }

    public void takeAway(){
        this.price += takeAway;
        optedTakeAway = true;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public void getBill(){
        if(hasExtraCheeseAdded){
            System.out.println("Extra Cheese added: " + extraCheeseadded);
//            this.price = this.price + extraCheeseadded;
        }
        if (hasExtraToppingsAdded){
            System.out.println("Extra Toppings added: " + extraToppingsadded);
//            this.price += extraToppingsadded;
        }
        if(optedTakeAway){
            System.out.println("Opted for take away: " + takeAway);
//            this.price += takeAway;
        }
        System.out.println("Total Bill: " + this.price);

    }
}
