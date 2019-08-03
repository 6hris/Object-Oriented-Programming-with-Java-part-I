/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Counter {
    private int startingVal;
    private int number;
    private boolean check;
    
    public Counter(int startingValue, boolean check){
        this.startingVal = startingValue;
        this.check = check;
        this.number = startingValue;
    }
    
    public Counter(int startingValue){
        this.number = startingValue;
        this.check = false;
        this.startingVal = startingValue;
        
    }
    
    public Counter(boolean check){
        this.check = check;
        this.startingVal = 0;
        this.number = 0;
        
    }
    
    public Counter(){
        this.startingVal = 0;
        this.number = 0;
        this.check = false;
       
    }
    
    public int value(){
        return this.number;
    }
    
    public void increase(){
        this.number++;
    }
    
    public void decrease(){
        if(this.check){
            if(this.number>=1){
                this.number--;
            }
        } else {
            this.number--;
        }   
    }
    
    public void increase(int increaseAmount){
        if (!(increaseAmount <0)){
            this.number += increaseAmount;
 
        }
    }
    
    public void decrease(int decreaseAmount){
        if (decreaseAmount > 0){
            if (check){
                if (this.number > decreaseAmount){
                    this.number -= decreaseAmount;
                } else {
                    this.number = 0;
                }
            } else {
                this.number -= decreaseAmount;

            }
            
        }
    }
}
