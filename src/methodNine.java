/*
Read two strings and two integers from input and call printPersonInfo() to output as follows.

Ex: If the input is Ralitza Eli 43 15, then the output is:

Ralitza is 43 years old.
Eli is 15 years old.
 */

import java.util.Scanner;
import java.lang.*;
public class methodNine {

	public static void printPersonInfo(String var1, int var2) {
		System.out.println(var1 + " is " + var2 + " years old.");
	}

	public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        String p1 = scan.next();
        String p2 = scan.next();
        int age1 = scan.nextInt();
        int age2 = scan.nextInt();

        printPersonInfo(p1, age1);
        printPersonInfo(p2, age2);
	}
}