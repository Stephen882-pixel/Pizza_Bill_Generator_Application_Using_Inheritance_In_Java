public class Pizza {
    private int price;
    private int basePizzaPrice;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;

        this.price += extraCheesePrice;
    }

    public void addExtraTopping(){
        isExtraToppingsAdded = true;

        this.price += extraToppingsPrice;
    }
    public void takeAway(){
        isOptedForTakeAway = true;
        System.out.println(" Take away opted ");
        this.price += backPackPrice;
    }
    public void getBill(){
        String bill = "";
        System.out.println(" The price of the pizza is : " + basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added:" + extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings added:" + extraToppingsPrice + "\n";
        }
        if(isOptedForTakeAway){
           bill += "Take away" + backPackPrice + "\n";
        }
        bill += "Bill:" + this.price + "\n";
        System.out.println(bill);

    }
}
