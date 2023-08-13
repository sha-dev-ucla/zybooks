import java.util.Scanner;

public class App {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElems;
      int[] userCounts;
      int i;

      numElems = scnr.nextInt();

      userCounts = new int[numElems];
      for (i = 0; i < userCounts.length; ++i) {
			userCounts[i] = scnr.nextInt();
		}

		int sumVals = 0;

      /* Your code goes here */

      System.out.println(sumVals);
   }
}