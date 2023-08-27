/*
In the Rabbit class, complete the public method definition for setColor() 
with the string parameter newColor.

Ex: If the input is 13 tan, then the output is:

Age: 13
Color: tan
*/

import java.util.Scanner;

public class RabbitData
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int userAge = scnr.nextInt();
        String userColor = scnr.nextLine();

        Rabbit xr = new Rabbit();

        xr.setAge(userAge);
        xr.setColor(userColor);

        System.out.println("Age: " + xr.getAge());
        System.out.println("Color: " + xr.getColor());



        scnr.close();

    }



    
}
