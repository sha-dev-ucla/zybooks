/*
Integer arrays firstArr and filterArr are read from input, each containing three elements.
If an element in firstArr is positive, then replace the element in firstArr with the
corresponding element in filterArr (which has only negative integers).

Ex: If the input is:

-16 33 22
-17 -25 -44
then the output is:

-16 -25 -44 
 */

 import java.lang.*;
 import java.util.*;

 public class multipleArray2
 {

    public static void main(String args[])
    {
        int NUM_ELEMENTS = 3;
        int[] firstArr = new int[NUM_ELEMENTS];
        int[] filterArr = new int[NUM_ELEMENTS];
        Scanner scan = new Scanner(System.in);

        //Populate firstArr
        for(int i = 0;i<NUM_ELEMENTS;i++)
        {
            firstArr[i] = scan.nextInt();
        }
         //Populate filterArr
        for(int i = 0;i<NUM_ELEMENTS;i++)
        {
            filterArr[i] = scan.nextInt();
        }
        //Funtion to replace postive values
        for(int i = 0;i<NUM_ELEMENTS;i++)
        {
            if(firstArr[i] <= 0)
            {
                firstArr[i] = (firstArr[i] + 0);
            }else
            {
                firstArr[i] = filterArr[i];
            }
        }
        // Print updated firstArr
        for(int i = 0;i<NUM_ELEMENTS;i++)
        {
            System.out.print(firstArr[i] + " ");
        }


    }


 }