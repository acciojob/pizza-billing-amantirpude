package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isToppings = false;
    private boolean isCheese = false;
    private boolean isTakeAway = false;

    private int extraCheesePrice;

    private int extraToppingsPrice;

    private int basePrice;
    private int takeAwayPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheesePrice = 80;
        // your code goes here
        if(isVeg){
            this.extraToppingsPrice = 70;
            this.basePrice = 300;
        }
        else{
            this.extraToppingsPrice = 120;
            this.basePrice = 400;
        }
        this.price = this.price + this.basePrice;
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

    public String getBill(){
        // your code goes here
        if(this.isCheese)
            this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
        if(this.isToppings){
            this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
        }
        if(this.isTakeAway)
            this.bill = this.bill + "Paperbag Added: "+ this.takeAwayPrice + "\n";
        this.bill = this.bill + "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
