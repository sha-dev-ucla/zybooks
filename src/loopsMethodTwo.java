/*
Define the method printValue() that takes two integer parameters and outputs
the product of all negative integers starting with the first and ending
with the second parameter. If no negative integers exist, product is
1. End with a newline. The method does not return any value.

Ex: If the input is -4 7, then the output is:

24
*/
import java.lang.*;
import java.util.*;

public class loopsMethodTwo
{

    public static void printValue(int valOne, int valTwo)
    {
        int answer = valOne;
        if(valOne > 0) // Case 1
        {
            System.out.println(1);
        }else if(valOne < 0 && valTwo > 0)
        {
            for(int i = valOne + 1;i<0;i++) //Case2
            {
                answer = answer * i;
            }
            //-45 * -44 -> 1980*-43 -> answer
            System.out.println(answer);
        }else //Case3
        {
            for(int i = valOne + 1;i<=valTwo;i++)
            {
                answer = answer * i;
            }
            //-45 * -44 -> 1980*-43 -> answer
            System.out.println(answer);
        }
        
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();

        printValue(numOne, numTwo);

    }

}















