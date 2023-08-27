/*
 * Author: Daniel Nunez and student ID
 * File  : Main.java
 * Desc  : Program that counts accurances of character 'n' in a given line
 */
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in); //Scanner to take intput from user
        int loopCount;
        String userWord; // store input string in for loop
        int charCounter = 0; // count 'n' occurances
        final char charValue = 'n'; // static char value
        
        System.out.print("Enter the max number of loops: ");
        loopCount = scnr.nextInt(); // get loop count
        System.out.println("Max tries is " + loopCount);
        
        for(int i = 0;i<loopCount;i++)
        {
            System.out.print("Please enter a word: ");
            userWord = scnr.next();
            charCounter = 0; //set counter at start
            for(int j = 0;j<userWord.length();j++)
            {
                if(userWord.charAt(j) == charValue)
                {
                    charCounter++;
                }

            }
            if(charCounter == 1) // format
            {
                System.out.println("word: " + userWord + " has " + charCounter + " letter n");
            }else
            {
                System.out.println("word: " + userWord + " has " + charCounter + " letter n's");    
            }

        }

        System.out.println(); //newline
         
        
        scnr. close(); 
        /*
        I was not certain about this piece of code but it removed warning on my IDE
        IDE warned that scanner is never closed
        */
        

    }


}