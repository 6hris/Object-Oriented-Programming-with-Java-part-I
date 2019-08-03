/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
import java.util.ArrayList;


public class Phonebook {
    private ArrayList<Person> book;
    
    public Phonebook(){
        this.book = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        book.add(new Person(name,number));
    }
    
    public void printAll(){
        for (Person i : book){
            System.out.println(i);
        }
    }
    
    public String searchNumber(String name){
        boolean test = false;
        String num = "";
        for (Person i : book){
            if(i.getName().contains(name)){
                test = true;
                 num = i.getNumber();
                return num;
            } 
        
        }
        
            return "number not known";
        
        
    }
}
