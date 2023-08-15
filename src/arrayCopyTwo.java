/*
Integer numValues is read from input, representing the number of integers to be read next.
Then, the remaining integers are read and stored into array pointsArray.
Write a loop that assigns array newArray with pointsArray's elements
shifted to the right by one index. The element at the end of
pointsArray should be copied to index 0 of newArray.

Ex: If the input is:

3
45 105 55
then the output is:

Original points: 45 105 55 
Updated points: 55 45 105 
 */

import java.lang.*;
import java.util.*;

public class arrayCopyTwo
{
    public static void main(String args[])
    {
        int numValues;
        Scanner scan = new Scanner(System.in);
        numValues = scan.nextInt();
        int[] pointsArray = new int[numValues];
        int[] newArray = new int[numValues];

        //Populate pointsArray
        for(int i =0;i<numValues;i++)
        {
            pointsArray[i] = scan.nextInt();
        }
        //Populate newArray with given functions
        for(int i = 0;i<numValues;i++)
        {
            if(i==0)
            {
                newArray[0] = pointsArray[numValues-1];

            }else
            {
                newArray[i] = pointsArray[i-1];
            }
        }

        System.out.print("Original points: ");
        for(int i =0;i<numValues;i++)
        {
            System.out.print(pointsArray[i] + " ");
        }
        System.out.println();
                System.out.print("Updated points: ");
        for(int i =0;i<numValues;i++)
        {
            System.out.print(newArray[i] + " ");
        }


    }


}