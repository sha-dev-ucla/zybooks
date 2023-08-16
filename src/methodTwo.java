/*
Define a method pyramidVolume with double data type parameters
baseLength, baseWidth, and pyramidHeight, that returns
as a double the volume of a pyramid with a rectangular base

Relevant geometry equations:
Volume = base area x height x 1/3
Base area = base length x base width.
(Watch out for integer division).
 */
import java.lang.*;
import java.util.*;

public class methodTwo
{
    public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight)
    {
        double answer = (baseLength*baseWidth*pyramidHeight) / 3;
        return answer;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        double userLength = scan.nextDouble();
        double userWidth = scan.nextDouble();
        double userHeight = scan.nextDouble();

        System.out.print(pyramidVolume(userLength, userWidth, userHeight));
    }

}

