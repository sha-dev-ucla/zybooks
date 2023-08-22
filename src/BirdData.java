/*
In the Bird class, complete the public method definition for setAge() 
with the integer parameter customAge.

Ex: If the input is beige 13, then the output is:

Color: beige
Age: 13 */

import java.lang.*;
import java.util.*;


public class BirdData
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String userColor = scan.nextLine();
        int userAge = scan.nextInt();

        Bird bird1 = new Bird();
        bird1.setColor(userColor);
        bird1.setAge(userAge);

        System.out.println(bird1.getColor());
        System.out.println(bird1.getAge());
    }


}