/*
Integer numPrices is read from input, representing the number of integers to be read next.
Then, the remaining integers are read and stored into array pricesList.
Initialize the array modifiedList to be half the size of pricesList.
Write a loop that iterates through modifiedList and assigns
each element in modifiedList with the corresponding
element in the first half of pricesList.

Ex: If the input is:

4
125 65 45 95
then the output is:

Original prices: 125 65 45 95 
First half of the prices: 125 65 
 */
import java.lang.*;
import java.util.*;

public class arrayCopyThree
{
    public static void main(String args[])
    {
        int numPrices;
        Scanner scan = new Scanner(System.in);
        numPrices = scan.nextInt();
        int[] pricesList = new int[numPrices];
        int[] modifiedList = new int[numPrices/2];

        for(int i =0;i<numPrices;i++)
        {
            pricesList[i] = scan.nextInt();
        }
        for(int i = 0;i<numPrices/2;i++)
        {
            modifiedList[i] = pricesList[i];
        }

        System.out.print("Original Prices: ");

        for(int i =0;i<numPrices;i++)
        {
            System.out.print(pricesList[i] + " ");
        }
        System.out.println();
        System.out.print("First half of the prices: ");
        
        for(int i =0;i<numPrices/2;i++)
        {
            System.out.print(modifiedList[i] + " ");
        }

    }

}