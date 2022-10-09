package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public boolean toppings = false;
    public boolean cheese = false;
    public boolean takeAway = false;

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
        if(!cheese){
            price = price + 80;
            cheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings){
            if(isVeg)
                price = price + 70;
            else
                price = price + 120;
            toppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            price = price + 20;
            takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
