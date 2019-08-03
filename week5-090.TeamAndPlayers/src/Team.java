/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author chris
 */
public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int max;
    
    public Team(String teamName){
        this.name = teamName;
        this.max = 16;
        
    }
    
    public String getName(){
        return name;
    }
    
    public void addPlayer(Player player){
        
            players.add(player);

        
    }
    
    public void printPlayers(){
        if(this.players.size()<this.max){
            for (Player i : this.players){
                System.out.println(i);
            }
        }
    }
    public void setMaxSize(int maxSize){
        this.max = maxSize;
    }
    
    public int size(){
        if (max < players.size()){
            return max;
        } else{ 
            return players.size();

        }
    }
    
    public int goals(){
        int totalGoals = 0;
        for (Player i : players){
            totalGoals += i.goals();
        }
        return totalGoals;
    }
}
