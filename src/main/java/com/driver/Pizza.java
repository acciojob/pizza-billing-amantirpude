package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isToppings = false;
    private boolean isCheese = false;
    private boolean isTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = this.price + 300;
        }
        else{
            this.price = this.price + 400;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isCheese){
            this.price = this.price + 80;
            this.isCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isToppings){
            if(isVeg){
                this.price = this.price + 70;
            }
            else{
                this.price = this.price + 120;
            }
            this.isToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeAway){
            this.price = this.price + 20;
            this.isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(this.isCheese)
            this.bill = this.bill + "Extra Cheese Added: " + 80 + "\n";
        if(this.isToppings){
            if(isVeg)
                this.bill = this.bill + "Extra Toppings Added: " + 70 + "\n";
            else
                this.bill = this.bill + "Extra Toppings Added: " + 120 + "\n";
        }
        if(this.isTakeAway)
            this.bill = this.bill + "Paperbag Added: "+ 20 + "\n";
        this.bill = this.bill + "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
