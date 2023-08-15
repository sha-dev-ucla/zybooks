/*
Integer numElements is read from input, representing the number
of integers to be read next. Then, the remaining integers
are read and stored into array weeklyRentArray. For each
element in weeklyRentArray that is less than 170,
assign the element with 170.

Ex: If the input is:

3
245 65 120
then the output is:
// Note maybe error in instructions
Raw weekly rent: 245 65 120 
Adjusted weekly rent: 245 130 240 
 */
import java.lang.*;
import java.util.*;

 public class arrayCopyOne
 {
    public static void main(String args[])
    {
        int numElements;
        Scanner scan = new Scanner(System.in);
        numElements = scan.nextInt();
        int[] weeklyRentArray = new int[numElements];

        for(int i =0;i<numElements;i++)
        {
            weeklyRentArray[i] = scan.nextInt();
        }
        System.out.print("Raw weekly rent: ");
        for(int i =0;i<numElements;i++)
        {
            System.out.print(weeklyRentArray[i] + " ");
        }

        for(int i =0;i<numElements;i++)
        {
            if(weeklyRentArray[i] < 170)
            {
                weeklyRentArray[i] = weeklyRentArray[i] * 2;
            }
        }
        System.out.print("Adjusted weekly rent: ");
        for(int i =0;i<numElements;i++)
        {
            System.out.print(weeklyRentArray[i] + " ");
        }






    }


 }