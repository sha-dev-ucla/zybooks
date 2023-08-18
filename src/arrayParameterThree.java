/*
Six integers are read from input and stored into the array myArray.
Then, numCompare is read from input. Write a static method 
filterArray() that takes an integer array parameter and an 
integer parameter. For each element in the array, if the 
element is greater than or equal to the integer
parameter, then replace the element with 0.
Otherwise, replace the element with 1.

Ex: If the input is:

35 60 95 30 45 80
57
then the output is:

Old array: 35 60 95 30 45 80 
New array: 1 0 0 1 1 0 
*/

import java.lang.*;
import java.util.*;

public class arrayParameterThree
{

    public static void filterArray(int[] arrayOne, int compVal)
    {
        for(int i =0;i<6;i++)
        {
            if(arrayOne[i] >= compVal)
            {
                arrayOne[i] = 0;
            }else
            {
                arrayOne[i] = 1;
            }
        }

    }

    public static void printArray(int[] arrayOne)
    {
        for(int i =0;i<6;i++)
        {
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();
    }



    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] myArray = new int[6];

        for(int i = 0;i<6;i++) // make varible next time
        {
            myArray[i] = scan.nextInt();
        }
        int numCompare = scan.nextInt();

        System.out.println("Old Array: ");
        printArray(myArray);


        System.out.println("New Array: ");
        filterArray(myArray, 6);
        printArray(myArray);





    }



}