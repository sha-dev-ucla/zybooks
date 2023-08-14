/*
Given the integer array yearlyPrices with the size of NUM_VALUES,
write a for loop to output the integers in the second half of yearlyPrices
 in reverse order. Separate the integers with an asterisk surrounded by
  spaces (" * ").

Ex: If the input is 87 49 38 35 90 109 42 79, then the output is:

79 * 42 * 109 * 90
 */

import java.lang.*;
import java.util.*;

 public class arrayOne
 {
    public static void main(String args[])
    {
        int NUM_VALUES;
        Scanner scan = new Scanner(System.in);
        NUM_VALUES = scan.nextInt();
        int[] yearlyPrices = new int[NUM_VALUES];

    //Populate Array using for loop
    for(int i = 0;i<NUM_VALUES;i++)
        {
            yearlyPrices[i] = scan.nextInt();

        }

    // Output in Reverse Order
    for(int j = NUM_VALUES;j>NUM_VALUES/2;j--)
    {
        System.out.print(yearlyPrices[j-1]);
        if(!((j-1) == (NUM_VALUES/2)))
        {
            System.out.print(" * ");
        }

    }



    }
    //Populate Array using for loop

    




 }