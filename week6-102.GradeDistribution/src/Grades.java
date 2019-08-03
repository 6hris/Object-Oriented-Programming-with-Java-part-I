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
public class Grades {
    private int[] gradeList;
    
    public Grades(){
        this.gradeList = new int[6];
    }
    
    public void getGrades(Scanner reader){
        int num = 0;
        while (!(num == -1)){
            num = Integer.parseInt(reader.nextLine());
            if (num < -1){
                //nothing
            } else if (num < 30 && num >= 0){
                gradeList [0] += 1;
            } else if (num < 35 && num >= 30){
                gradeList [1] += 1;
            } else if (num < 40 && num >= 35){
                gradeList [2] += 1;
            } else if (num < 45 && num >=40){
                gradeList [3] += 1;
            } else if (num < 50 && num >=45){
                gradeList [4] += 1;
            } else if (num < 61 && num >=50){
                gradeList [5] += 1;
            }
        }
    }
    
    public void printGrade(){
        System.out.println("Grade distribution: ");
        System.out.print("5: ");
        this.printStars(5);
        System.out.print("4: ");
        this.printStars(4);
        System.out.print("3: ");
        this.printStars(3);
        System.out.print("2: ");
        this.printStars(2);
        System.out.print("1: ");
        this.printStars(1);
        System.out.print("0: ");
        this.printStars(0);
        
        System.out.println("Acceptance percentage: " + acceptance());
    }
    
    public void printStars(int numStar){
        int numOfStars = gradeList [numStar];
        for (int j = 0; j < numOfStars; j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public double acceptance(){
        int accept = this.gradeList[1]+this.gradeList[2]+this.gradeList[3]+this.gradeList[4]+this.gradeList[5];
        int fail = this.gradeList[0];
        
        int total = accept + fail;

        if (accept==0) {
            return 0.0;
        } else if (fail==0) {
            return 100.0;
        } else {
                double acceptance = (((double) accept) / ((double) total)) *100.0;
                return acceptance;         //With Input: 44, 12, 58, 29, 60, -1  -- THIS IS NOT WORKING!!! It rounds wrong somehow
        }

    }
}
