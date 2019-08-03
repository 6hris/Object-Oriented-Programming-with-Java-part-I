/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double startBal){
        this.balance = startBal;
    }
    
    public String toString(){
        return "The card has " + balance + " euros";
    }
    
    public void payEconomical(){
        if (balance >= 2.50){
            this.balance = balance - 2.50;

        }
    }
    
    public void payGourmet(){
        if (balance >= 4.00){
          this.balance = balance - 4.00;  
        }
        
    }
    
    public void loadMoney(double amount){
        if (amount > 0){
            balance += amount;

        }
        if (balance > 150){
            balance = 150;
        }
    }
}