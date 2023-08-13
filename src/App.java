/*
Integer numElems is read from input and integer array userCounts is declared with size numElems.
Then, numElems integers are read from input and stored into userCounts. Assign integer sumVals with
 the sum of the first element and the last element of the array.

Ex: If the input is:
5
11 84 19 12 64

then the output is:
75
 */


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
      sumVals = userCounts[0] + userCounts[numElems - 1];

      System.out.println(sumVals);
   }
}