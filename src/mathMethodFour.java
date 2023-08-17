/*
Define the following modular methods:
findPrismBaseArea() takes two double parameters as a prism's base length and base width.
The method returns the area of the prism's base as a double.
The area of the base is calculated by: 
findPrismVolume() takes three double parameters as a prism's base length, base width, and height.
The method returns the prism's volume as a double, and uses the findPrismBaseArea()
method to calculate the prism's base area. The volume is calculated by: 
Ex: If the input is 5.0 2.0 4.0, then the output is:

Base length: 5.0
Base width: 2.0
Height: 4.0
Base area: 10.0
Volume: 40.0
 */

import java.lang.*;
import java.util.*;

public class mathMethodFour
{
    public static double findPrismBaseArea(double baseLength, double baseWidth)
    {
        double answer = (baseLength * baseWidth);
        return answer;
    }
    public static double findPrismVolume(double baseLength2, double baseWidth2, double prismHeight)
    {
        double answer = findPrismBaseArea(baseLength2, baseWidth2);
        answer = answer * (prismHeight);
        return answer;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double userLength = scan.nextDouble();
        double userWidth = scan.nextDouble();
        double userHeight = scan.nextDouble();

        System.out.println("Base length: "+ userLength);
        System.out.println("Base width: " + userWidth);
        System.out.println("Height: " + userHeight);
        System.out.println("Base area: " + findPrismBaseArea(userLength, userWidth));
        System.out.println("Volume: " + findPrismVolume(userLength, userWidth, userHeight));

    }
}