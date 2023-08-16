/*
Define stubs for the methods called by the below main().
Each stub should print "FIXME: Finish methodName()"
followed by a newline, and should return -1.

  Example output:
FIXME: Finish getUserNum()
FIXME: Finish getUserNum()
FIXME: Finish computeAvg()
Avg: -1
 */
import java.util.Scanner;

public class methodEleven {

/* Your solution goes here  */
   public static int getUserNum()
   {
    System.out.println("FIXME: Finish getUserNum()");
    return -1;
   }
   
   
   public static int computeAvg(int n1, int n2)
   {
    System.out.println("FIXME: Finish computeAvg()");
    return -1;
   }

   public static void main(String [] args) {
      int userNum1;
      int userNum2;
      int avgResult;

      userNum1 = getUserNum();
      userNum2 = getUserNum();

      avgResult = computeAvg(userNum1, userNum2);

      System.out.println("Avg: " + avgResult);
   }
}