import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrint = 0;
        
    }
    
    public NightSky(int width, int height){
        this.density = .1;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
        

    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }
    
    public void printLine(){
        
        for (int i = 0; i < this.width; i++){
            Random random = new Random();
            double prob = random.nextDouble();
            if (prob <= this.density){
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void print(){
        for (int i = 0; i < this.height; i++){
            printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint(){
        int holder = this.starsInLastPrint;
        this.starsInLastPrint = 0;
        return holder;
        
    }
}

