/*
Define a method printEmployeePay() that takes one string parameter and one integer parameter and outputs as follows,
ending with a newline. The method should not return any value.

Ex: If the input is Felipe 95000, then the output is:

-- Felipe --
earns 95000 dollars per year.
 */

import java.lang.*;
import java.util.*;

public class methodSeven
{
    public static void printEmployeePay(String inName, int inValue)
    {
        System.out.println("-- " + inName + " --");
        System.out.println("earns " + inValue + " dollars per year.");

    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        int userInt = scan.nextInt();

        printEmployeePay(userName, userInt);
    }

}