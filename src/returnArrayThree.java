/*
The supplyDetails() method takes in one string array parameter, oldArray. 
Complete supplyDetails() to declare an array that concatenates the string " needs to be replaced" 
to each element in oldArray. 

Then, return the new array.

Ex: If the input is paperclip paper envelope ruler, then the output is:

paperclip needs to be replaced
paper needs to be replaced
envelope needs to be replaced
ruler needs to be replaced
*/
import java.lang.*;
import java.util.*;

public class returnArrayThree
{
    public static String[] supplyDetails(String[] myArray)
    {
        String[] newArray = new String[myArray.length];

        for(int i = 0;i<myArray.length;i++)
        {
            newArray[i] = myArray[i] + " needs to be replaced";

        }
        return newArray;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String[] myArray = new String[4];
        String[] newArray;

        for(int i =0;i<myArray.length;i++)
        {
            myArray[i] = scan.nextLine();
        }

        newArray = supplyDetails(myArray);

        for(int i =0;i<newArray.length;i++)
        {
            System.out.println(newArray[i]);
        }

    }
}