/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;
/**
 *
 * @author jacob
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        String word, checkWord = "";
        
        System.out.println("Please enter a word to check if it is a palindrome: ");
        word = in.next();
        
        int length = word.length(), i = 0;
        
        for(i = length -1; i >= 0; i--)
            checkWord = checkWord + word.charAt(i);
        
        if(word.equals(checkWord))
            System.out.println("Your word is a palindrome.");
        else
            System.out.println("Your word is not a palindrome");
    }
    
    
    
}
