/*
Define the method findMaximum() with a Scanner parameter that reads integers
from input until a negative integer is read. The method returns the
largest of the integers read.

Ex: If the input is 95 50 65 -75 -70 10 45, then the output is:

95
Note: Negative numbers are less than 0.
*/
import java.util.Scanner;

public class loopMethodThree {

   /* Your code goes here */
   public static int findMaximum(Scanner scan)
   {
    //need to stop when negitive value is read
    // need to to have a compare value
    //My hardest program personally for some reason but finally got it :)
    int value = 1;
    int maxValue = 0;
    while(value > 0)
    {
        value = scan.nextInt();
        if(maxValue < value)
        {
            maxValue = value;
        } 
    }
    return maxValue;

   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int maxVal;
      
      maxVal = findMaximum(scnr);
      
      System.out.println(maxVal);
   }
}