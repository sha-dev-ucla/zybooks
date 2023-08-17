/*
Define a method findPrize() that takes one integer parameter
as the lottery number, and returns the prize as an integer.
The prize is returned as follows:

If lottery number is 198 or 443, prize is $11000.
If lottery number is 619 or 790, prize is $17000.
Otherwise, prize is $0.
Ex: If the input is 198, then the output is:

11000
*/

import java.lang.*;
import java.util.*;

public class methodBranchTwo
{
    
    public static int findPrize(int lottoNum)
    {
        if(lottoNum == 198 || lottoNum == 443)
        {
            return 11000;
        }else if(lottoNum == 619 || lottoNum == 790)
        {
            return 17000;
        }else
        {
            return 0;
        }
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        System.out.println(findPrize(userInput));
    }
}