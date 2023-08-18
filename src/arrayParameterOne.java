/*
Four integers are read from input and stored into the array pointArray. 
Write a static method swapArrayPos() that takes an integer array 
parameter and swaps the first element with the 
last element of the array.

Ex: If the input is 30 95 15 20, then the output is:

Original array: 30 95 15 20 
Changed array: 20 95 15 30 

*/

import java.lang.*;
import java.util.*;

public class arrayParameterOne
{
    public static void swapArrayPos(int[] pArray)
    {
        for(int i = 0;i<4;i++)
        {
            if(i == 0)
            {
                int tempVal = pArray[0];
                pArray[0] = pArray[pArray.length-1];
                pArray[pArray.length-1] = tempVal;
            }

        }
    }

    public static void printArray(int[] pointArray)
    {
        for(int i =0;i<pointArray.length;i++)
        {
            System.out.print(pointArray[i] + " ");
        }

    }



    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] pointArray = new int[4];

        for(int i =0;i<4;i++)
        {
            pointArray[i] = scan.nextInt();
        }

        System.out.println("Before Swap ");
        printArray(pointArray);

        System.out.println("After Swap ");
        swapArrayPos(pointArray);
        printArray(pointArray);
        

    }



}