/*
Define a method printDifferenceOf2() that takes two double parameters,
and outputs "Result: " followed by the result of subtracting the
first parameter by the second parameter with a precision of
one digit as follows, ending with a newline.

Ex: If the input is -21.0 16.0, then the output is:

Result: -37.0

Note:

The calculation to find the difference of two values x and y is (x - y).
Use System.out.printf("%.1f", myDouble) to output doubles with precision of one digit.

 */

 import java.lang.*;
 import java.util.*;

 public class methodEight
 {
    public static void printDifferenceOf2(double doubleOne, double doubleTwo)
    {
        double myDouble = (doubleOne - doubleTwo);
        //System.out.printf("%.1f", myDouble);
        //System.out.println();
        System.out.println("Result: " + myDouble * 1.0 / 1.0);

    }


    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        double firstInput = scan.nextDouble();
        double secondInput = scan.nextDouble();

        printDifferenceOf2(firstInput, secondInput);

    }


 }