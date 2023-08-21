/*
The changeTemperatures() method takes in two parameters: integer array 
tempList and integer numExpand. Complete changeTemperatures() to create 
a new array called newArray with the same elements as tempList, and 
the size increased by numExpand.

Ex: If the input is:

39 21 18
2
then the output is:

39 21 18 0 0 
*/

import java.lang.*;
import java.util.*;

public class returnArrayTwo
{
    public static int[] changeTemperatures(int myArray[], int userVal)
    {
        int[] newArray = new int[myArray.length + userVal];

        for(int i =0;i<myArray.length;i++)
        {
            newArray[i] = myArray[i];
        }
        return newArray;

    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] myArray = new int[3];
        int[] newArray;
        int userValue;

        for(int i =0;i<3;i++)
        {
            myArray[i] = scan.nextInt();
        }
        userValue = scan.nextInt();

        newArray = changeTemperatures(myArray, userValue);

        for(int i =0;i<newArray.length;i++)
        {
            System.out.print(newArray[i] + " ");
        }
    }

}