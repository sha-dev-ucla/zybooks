/*
Given the integer array hourlySalaries with the size of NUM_INPUTS,
 write a for loop that sets sumBonus to the total bonuses. 
 Salaries above 300 contain bonuses.

Ex: If the input is 56 399 57 82 83, then the output is:

Bonus sum: 99
Note: To find a bonus salary, the salary is subtracted by the base salary of 300.
 */
import java.lang.*;
import java.util.*;

public class appThree
{
    public static void main(String args[])
    {
        int NUM_INPUTS;
        int sumBonus;
        Scanner scan = new Scanner(System.in);
        NUM_INPUTS = scan.nextInt();
        int[] hourlySalaries = new int[NUM_INPUTS];

        for(int i = 0;i<NUM_INPUTS;i++)
        {
            hourlySalaries[i] = scan.nextInt();
        }
        sumBonus = 0;
        for(int i = 0;i<NUM_INPUTS;i++)
        {
            if(hourlySalaries[i] > 300)
            {
                //add new int k so that sumBonus add properly
                int k = (hourlySalaries[i] - 300);
                sumBonus = sumBonus + k;
            }
        }
        System.out.print("Bonus sum: " + sumBonus);
    }

}















