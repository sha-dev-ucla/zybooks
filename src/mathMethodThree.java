/*
Define a method convertVolume() that takes two integer parameters as
the number of quarts and pints. The method returns a double as the
volume converted to liters, given that:

1 pint = 0.568261 liters
1 quart = 2 pints
Ex: If the input is 3 59, then the output is:

The number of liters is 36.937
 */

import java.lang.*;
import java.util.*;

public class mathMethodThree
{
    public static double convertVolume(int quartVal, int pintVal)
    {
        quartVal = quartVal * 2;
        int totalPints = quartVal + pintVal;
        double answer = (totalPints * 0.568261);
        return answer;
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int qVal = scan.nextInt();
        int pVal = scan.nextInt();

        System.out.printf("The number of liters is %.3f\n",  convertVolume(qVal, pVal));
    }
}