/*
Integer arrays origArray and offsetArray are read from input, each containing four elements.
 Update each element in origArray with origArray's element minus the corresponding element in offsetArray.

Ex: If the input is:

45 40 20 30
10 25 50 15
then the output is:

35 15 -30 15 
 */
import java.lang.*;
import java.util.*;

public class multipleArray
{
    public static void main(String args[])
    {
        int NUM_ELEMENTS = 4;
        int[] origArray = new int[NUM_ELEMENTS];
        int[] offsetArray = new int[NUM_ELEMENTS];
        Scanner scan = new Scanner(System.in);

        //Populate origArray
        for(int i =0; i<NUM_ELEMENTS;i++)
        {
            origArray[i] = scan.nextInt();
        }
        //Populate offsetArray
        for(int i =0; i<NUM_ELEMENTS;i++)
        {
            offsetArray[i] = scan.nextInt();
        }

        //Funtion to preform origArray - offsetArray
        for(int i =0; i<NUM_ELEMENTS;i++)
        {
            origArray[i] = (origArray[i] - offsetArray[i]);
        }

        //Output updated origArray
        for(int i =0; i<NUM_ELEMENTS;i++)
        {
            System.out.print(origArray[i] + " ");
        }

    }

}