/*
Define a method printAirportDetails() that takes two string parameters
and outputs as follows, ending with a newline.
The method should not return any value.

Ex: If the input is ATL Atlanta, then the output is:

ATL is Atlanta's airport code.
 */
import java.lang.*;
import java.util.*;

public class methodSix
{
    // Not best names but ... :(
    public static void printAirportDetails(String shortWord, String longWord)
    {
        System.out.println(shortWord + " is " + longWord + "'s airport code.");

    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String abrvLocation = scan.nextLine();
        String fullLocation = scan.nextLine();

        printAirportDetails(abrvLocation, fullLocation);

    }

}