/*
Fill in the parameters in the second method header for the overloaded method printAnimal().
The number, type, and order of the method parameters are indicated in the method 
call from main().

Ex: If the input is bird 3, then the output is:

9 sloths in the tree
3 birds in the tree
*/

import java.util.Scanner;

public class methodOverloadOne {
   public static void printAnimal(String animal) {
      System.out.println("9 " + animal + "s in the tree");
   }
   
   public static void printAnimal(String animal, int inputNum) {
      System.out.println(inputNum + " " + animal + "s in the tree");
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String animal;
		int num;
      
      animal = scnr.next();
		num = scnr.nextInt();
      
      printAnimal("sloth");
      printAnimal(animal, num); // Overloaded method called
   }
}