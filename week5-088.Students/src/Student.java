/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Student {
    private String name;
    private String studentNum;
    
    public Student(String givenName, String studentNumber){
        this.name = givenName;
        this.studentNum = studentNumber;
    }
    
    public String getName(){
        return this.name;
    }
        
    public String getStudentNumber(){
        return this.studentNum;
    }
    
    public String toString(){
        return name + " (" + studentNum + ")";
    }
}
