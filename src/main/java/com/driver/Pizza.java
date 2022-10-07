package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            price = price + 300;
        else
            price = price + 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price = price + 80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
            price = price + 70;
        else
            price = price + 120;
    }

    public void addTakeaway(){
        // your code goes here
        price = price + 20;
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
