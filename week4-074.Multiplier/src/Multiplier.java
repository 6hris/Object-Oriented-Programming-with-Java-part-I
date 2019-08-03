/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Multiplier {
    private int multi;
    
    public Multiplier(int number){
        this.multi= number;
    }    
    
    public int multiply(int otherNumber){
        otherNumber = multi * otherNumber;
        return otherNumber;
    }
}
