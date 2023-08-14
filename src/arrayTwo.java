/*
Given the integer array averageSalaries with the size of 
NUM_ELEMENTS, write a for loop to initialize the first 
half of averageSalaries with the integers read from 
input.

Ex: If the input is 60 108 80 67, then the output is:

60 108 80 67 0 0 0 0
 */
import java.lang.*;
import java.util.*;

 public class arrayTwo
 {
    public static void main(String args[])
    {

        int NUM_ELEMENTS;
        Scanner scan = new Scanner(System.in);
        NUM_ELEMENTS = scan.nextInt();

        int[] averageSalaries = new int[NUM_ELEMENTS];
        // Filling Array
        // Since i starts at 0 count up to middle
        for(int i = 0;i<(NUM_ELEMENTS);i++)
        {
            if(i<(NUM_ELEMENTS/2))
            {
                averageSalaries[i] = scan.nextInt();
            }else
            {
                averageSalaries[i] = 0;
            }
            
        }
        //Output Array Contents
        for(int i = 0;i<(NUM_ELEMENTS);i++)
        {
            if((i+1) == NUM_ELEMENTS)
            {
                System.out.print(averageSalaries[i]);
            }else
            {
                System.out.print(averageSalaries[i] + " ");
            }
        }

    }
 }