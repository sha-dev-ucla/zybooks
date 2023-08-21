/*
The newSecondHalf() method takes in two parameters: one integer 
array and one integer. newSecondHalf() returns a new array 
reference where the first half contains the same elements 
as the first half of the array parameter and each element 
of the second half is the integer parameter. Call newSecondHalf() 
with startNumbers and changeVal as arguments and assign 
endNumbers with the returned array reference.
*/
import java.lang.*;
import java.util.*;

public class returnArray
{
    public static int[] newSecondHalf(int[] myArray, int userVal)
    {
        int[] newArray = new int[myArray.length];
        for(int i = 0;i<myArray.length;i++)
        {
            if(i < myArray.length/2)
            {
                newArray[i] = myArray[i];
            }else
            {
                newArray[i] = userVal;
            }
        }
        return newArray;

    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int arrayValue = 6;
        int userInput;
        int[] myArray = new int[arrayValue];
        int[] newArray;

        for(int i =0;i<arrayValue;i++)
        {
            myArray[i] = scan.nextInt();
        }

        userInput = scan.nextInt();

        newArray = newSecondHalf(myArray, userInput);

        for(int i =0;i<newArray.length;i++)
        {
            System.out.print(newArray[i] + " ");
        }

    }

}