/*
Define the method printVals() that takes two integer parameters
and outputs all integers starting with the first and ending
with the second parameter, each multiplied by 1000 and
followed by a newline. The method does not return
any value.

Ex: If the input is 2 5, then the output is:

2000
3000
4000
5000
Note: Assume the first integer parameter is less than the second.
 */

import java.lang.*;
import java.util.*;

public class methodLoopsOne
{
    public static void printVals(int firstVal, int secondVal)
    {
        for(int i = firstVal;i<=secondVal;i++)
        {
            System.out.println(i * 1000);
        }

    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int valOne = scan.nextInt();
        int valTwo = scan.nextInt();
        printVals(valOne, valTwo);
    }
    
}