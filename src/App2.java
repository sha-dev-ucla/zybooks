/*
Integer numElements is read from input and integer array userScore is declared with size numElements.
Then, numElements integers are read from input and stored into userScore. Output all elements of userScore in order,
following each element with a space, including the last. After the final output, end with a newline.

Ex: If the input is
4
34 67 54 33

then the output is:
Array contents: 34 67 54 33
*/

import java.util.Scanner;

public class ApplicantLog {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElems; 
      int i;
      
      numElems = scnr.nextInt();
      int[] applicantNumbers = new int[numElems];
      
	for (i = 0; i < applicantNumbers.length; ++i) {
			applicantNumbers[i] = scnr.nextInt();
		}
		System.out.print("Array contents: ");
      // Your code here
    for(int j = 0;j<numElems;j++)
        {
            
            System.out.print(applicantNumbers[j] + " ");
        }
                System.out.println();
      
   }
}