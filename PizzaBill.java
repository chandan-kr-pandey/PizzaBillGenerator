/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package PizzaBillGenerator;

/**
 *
 * @author user
 */
public class PizzaBill {

    public static void main(String[] args) {
     
    // Pizza basePizza = new Pizza(true);  // instance of class is created
     //basePizza.addExtraToppings();
    // basePizza.addExtraCheese();
     //basePizza.takeAway();
     //basePizza.getBill();
     DeluxPizza dp = new DeluxPizza(true);
     dp.takeAway();
     dp.getBill();
    }
}
