/*
Define a method printFeetInchShort(), with int parameters numFeet and numInches,
that prints using ' and " shorthand. End with a newline.
 Remember to use println instead of print to output a newline.
 
Ex: printFeetInchShort(5, 8) prints:
5' 8"
Hint: Use \" to print a double quote.
 */
import java.util.*;
import java.lang.*;

 public class methodFive
 {
    public static void printFeetInchShort(int numFeet, int numInches)
    {
        System.out.println(numFeet + "' " + numInches + "\"");

    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int feetVal = scan.nextInt();
        int inchVal = scan.nextInt();

        printFeetInchShort(feetVal, inchVal);

    }

 }