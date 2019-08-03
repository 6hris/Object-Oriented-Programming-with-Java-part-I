/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Product {
    private double price;
    private int amount;
    private String name;
    
    public Product (String startName, double prodPrice, int prodAmount){
        this.name = startName;
        this.price = prodPrice;
        this.amount = prodAmount;
    }
    
    public void printProduct(){
        System.out.println(name + ", price " + price + ", amount " + amount);
    }
}


