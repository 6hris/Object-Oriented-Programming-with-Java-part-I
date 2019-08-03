/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Person {
    private String name;
    private String studentNum;
    
    public Person(String name, String num){
       this.name = name;
       this.studentNum = num;
    }
    
    public String getName(){
        return name;
    }
    
    public String getNumber(){
        return studentNum;
    }
    
    public String toString(){
        return name + " number: " + studentNum;
    }
    
    public void changeNumber(String newNumber){
        studentNum = newNumber;
    }
}
