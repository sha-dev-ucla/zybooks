/*
Complete the method convertToMilliliters() that takes one integer
parameter as a volume in fluid ounces. The method returns a
double as the volume converted to milliliters, given that
1 fluid ounce = 29.5735 milliliters.

Ex: If the input is 40, then the output is:

Result: 1182.940 milliliters
 */
import java.lang.*;
import java.util.*;

public class mathMethodTwo
{
    public static double convertToMilliliters(int userVal)
    {
        double answer = (userVal * 29.5735);
        return answer;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        System.out.printf("Result: %.3f milliliters\n", convertToMilliliters(userInput));

    }

}