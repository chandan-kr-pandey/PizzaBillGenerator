/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PizzaBillGenerator;

/**
 *
 * @author user
 */
public class DeluxPizza extends Pizza {

    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraToppings() {
       
    }

    @Override
    public void addExtraCheese() {
        
    }
    
    
}
