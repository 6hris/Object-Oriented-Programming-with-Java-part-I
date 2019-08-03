/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        String theWord = word.toUpperCase();
        String theSearched = searched.toUpperCase();
        theWord = theWord.trim();
        theSearched = theSearched.trim();
        if (theWord.contains(theSearched)){
            return true;
        } else {
            return false;
        }
    }
}
