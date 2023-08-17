/*
Define the method inspectVals() with a Scanner parameter that reads integers
from input until 1 is read. The method returns true if all integers read
before 1 are positive. Otherwise, the method returns false.

Ex: If the input is 60 30 80 1, then the output is:

All true
Note: Positive numbers are greater than zero.
*/

import java.util.Scanner;

public class loopMethodFour {

   /* Your code goes here */
   public static Boolean inspectVals(Scanner scan)
   {
    int userVal = 0;
    int newVal = 1;
    Boolean answer = true;
    while(userVal != 1)
    {
        userVal = scan.nextInt();
        if(userVal > 0)
        {
            answer = true;
        }else
        {
            answer = false;
            break;
        }
    }
    return answer;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      boolean allPositive;
      
      allPositive = inspectVals(scnr);
      if (allPositive) {
			System.out.println("All true");
		}
		else {
			System.out.println("Not all true");
		}
   }
}