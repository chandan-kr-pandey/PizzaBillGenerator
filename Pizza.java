/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PizzaBillGenerator;

/**
 *
 * @author user
 */
public class Pizza {
   private int price;
    private Boolean veg;  // if true means veg ,if false means non-veg
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice ;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;
    public Pizza(Boolean veg) {      //constructor 
        this.veg = veg;
        if(this.veg){ // if it is veg
        this.price=300;
        }else{
        this.price=400; // if it non-veg
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
   // System.out.println("Extra Cheese Added");
    this.price += extraCheesePrice;
    }
  public void addExtraToppings(){
      isExtraToppingsAdded = true;
    //  System.out.println("Extra Toppings Added");
    this.price += extraToppingsPrice;
  }
   public void takeAway(){
       isOptedForTakeAway = true;
    //   System.out.println("Take Away Opted");
     this.price += backPackPrice;
   }
   public void getBill(){
       String bill ="";
       System.out.println("Pizza :" + basePizzaPrice);
       if(isExtraCheeseAdded ){
           bill +="Extra Cheese Added :" + extraCheesePrice + "\n";
       }
       if(isExtraToppingsAdded){
         bill += "Extra Toppings Added :" + extraToppingsPrice + "\n";
       }
       if(isOptedForTakeAway){
           bill += "Take Away :" + backPackPrice + "\n";
       }
       bill += "Bill :" + this.price + "\n";
       System.out.println(bill);
   }  
}
/* 
base pizza = 300
toppings = 150
cheese = 100
take away = 20

*/