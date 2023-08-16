/*
Define a method calculateNum() that takes one integer parameter
 and returns the parameter plus 9.

Ex: If the input is 3, then the output is:

12
 */

import java.lang.*;
import java.util.*;

public class methodThree
{
    public static int calculateNum(int givenInt)
    {
        int answer = (givenInt + 9);
        return answer;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int userInt = scan.nextInt();

        System.out.println(calculateNum(userInt));
    }

}
