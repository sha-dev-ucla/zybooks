/*
In the Wasp class, declare the following private fields:

string color
integer age
and define the following public methods:

getColor() has no parameters and returns the color field.
getAge() has no parameters and returns the age field.
Ex: If the input is beige 19, then the output is:

Color: beige
Age: 19
Note: If a field is not properly declared as private, an error message will be output.
*/

import java.lang.*;
import java.util.*;

public class WaspDetails
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Wasp test = new Wasp();
        
        String userInput = scan.nextLine();
        int userAge = scan.nextInt();    

        test.setColor(userInput);
        test.setAge(userAge);

        System.out.println("Color: " + test.getColor());
        System.out.println("Age: " + test.getAge());

    }
    
}