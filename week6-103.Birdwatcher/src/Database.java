import java.util.ArrayList;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Database {
    private ArrayList<Bird> birdList;
    
    public Database(){
        birdList = new ArrayList<Bird>();
    }
    
    public void addBird(Scanner reader){
        System.out.println("name: ");
        String newName = reader.nextLine();
        System.out.println("Latin name: ");
        String newLatin = reader.nextLine();
        Bird newBird = new Bird(newName,newLatin);
        birdList.add(newBird);
    }
    
    public void observation(Scanner reader){
        System.out.println("What is observed: ");
        String observed = reader.nextLine();
        int indexNum = search(observed);
        if (indexNum > -1){
            birdList.get(indexNum).observed();
        } else {
            System.out.println("This is not a bird!");
        }
        
    }
    
    public int search(String observed){
        int count = 0;
        for (Bird i : birdList){
            if (StringUtils.included(i.returnName(), observed)){
                return count;
            }
            count++;
        }
        return -1;
    }
    
    public void show(Scanner reader){
        System.out.println("Which bird?");
        String birdName = reader.nextLine();
        for (Bird i : birdList){
            if (StringUtils.included(i.returnName(), birdName)){
                System.out.println(i);
            }
        }
    }
    
    public void statistics(){
        for (Bird i : birdList){
            System.out.println(i);
        }
    }
}
