/*
Five integers are read from input and stored into the array numberArray. 
Write a static method subtractIndexFromElements() that takes an integer 
array parameter and replaces each element with the difference between 
the element and the element's index.

Ex: If the input is 60 25 75 85 70, then the output is:

Input: 60 25 75 85 70 
Output: 60 24 73 82 66 
*/

import java.util.*;
import java.lang.*;

public class arrayParameterTwo
{
    public static void subtractIndexFromElements(int[] newArray)
    {
        for(int i =0;i<5;i++)
        {
            newArray[i] = newArray[i] - i;
        }

    }

    public static void printArray(int[] newArray)
    {
        for(int i =0;i<5;i++)
        {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] numberArray = new int[5];

        for(int i =0;i<5;i++)
        {
            numberArray[i] = scan.nextInt();
        }

        System.out.println("Before Swap: ");
        printArray(numberArray);


        System.out.println("After Swap: ");
        subtractIndexFromElements(numberArray);
        printArray(numberArray);
    }
}
