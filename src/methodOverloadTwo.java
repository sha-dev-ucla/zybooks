/*
The method printGatheringSize() has a string parameter. 
Define a second printGatheringSize() method that has 
an integer parameter. The second method outputs 
the following in order, all on one line:

"Order for size: "
the value of the integer parameter
End with a newline.
Ex: If the input is nine 9, then the output is:

The gathering needs a room for nine.
Order for size: 9
*/
import java.util.Scanner;

public class methodOverloadTwo {
   public static void printGatheringSize(String gatheringSize) {
      System.out.println("The gathering needs a room for " + gatheringSize + ".");
   }

   public static int printGatheringSize(int userVal)
   {
    System.out.println("Order for size: " + userVal);
    return userVal;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String sizeInWord;
      int sizeOfGathering;
      
      sizeInWord = scnr.next();
      sizeOfGathering = scnr.nextInt();
      
      printGatheringSize(sizeInWord);
      printGatheringSize(sizeOfGathering);
   }
}