package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isToppings;
    private boolean isCheese;
    private boolean isTakeAway;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int basePrice;
    private int takeAwayPrice;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheese = false;
        this.isToppings = false;
        this.isTakeAway = false;
        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;

        this.isBillGenerated = false;
        // your code goes here
        if(isVeg){
            this.extraToppingsPrice = 70;
            this.price = 300;
        }
        else{
            this.extraToppingsPrice = 120;
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheese == false){
            this.price = this.price + this.extraCheesePrice;
            this.isCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppings == false){
            this.price = this.price + this.extraToppingsPrice;
            this.isToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeAway){
            this.price = this.price + this.takeAwayPrice;
            this.isTakeAway = true;
        }
    }

    public String getBill() {
        // your code goes here
        if(!this.isBillGenerated){
            isBillGenerated = true;
            if (this.isCheese)
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            if (this.isToppings) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }
            if (this.isTakeAway)
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;

    }
}
