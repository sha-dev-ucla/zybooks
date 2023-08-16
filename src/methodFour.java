/*
Define a method computeNum() that takes two integer parameters
 and returns the product of the two parameters minus 8.

Ex: If the input is 5 9, then the output is:

37
 */

import java.lang.*;
import java.util.*;

public class methodFour
{
    public static int computeNum(int firstNum, int secondNum)
    {
        int answer = (firstNum*secondNum) - 8;
        return answer;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();

        System.out.print(computeNum(numOne, numTwo));

    }

}