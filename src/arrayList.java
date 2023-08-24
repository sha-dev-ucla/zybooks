/*
Declare and initialize a reference variable for an ArrayList 
named heightList that stores items of type Integer. 
Read integer numHeights from input. Then, insert numHeights 
integers with values from 1 to numHeights into heightList, in that order.

Ex: If the input is 2, then the output is:

1 2 

Note: Assume that numHeights is positive.
*/
import java.util.*;
import java.lang.*;

public class arrayList
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int numHeights = scan.nextInt();
        ArrayList<Integer> heightList = new ArrayList<Integer>();

        for(int i = 0;i<numHeights;i++)
        {
            heightList.add(i+1);
        }

        for(int i = 0;i<numHeights;i++)
        {
            System.out.print(heightList.get(i) + " ");
        }


    }


}