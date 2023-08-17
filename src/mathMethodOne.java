/*
Define a method calcPyramidVolume with double data type parameters baseLength,
baseWidth, and pyramidHeight, that returns as a double the volume of a
pyramid with a rectangular base. calcPyramidVolume() calls the given
calcBaseArea() method in the calculation.

Relevant geometry equations:
Volume = base area x height x 1/3
Base area = base length x base width.
(Watch out for integer division).

 */

import java.util.*;
import java.lang.*;

public class mathMethodOne
{
    public static double calcBaseArea(double bVal, double wVal)
    {
        double calcVal = bVal * wVal;
        return calcVal;

    }



    public static double calcPyramidVolume(double baseLength, double baseWidth, double pyramidHeight)
    {
        double answer = calcBaseArea(baseLength, baseWidth) * (pyramidHeight/3);
        return answer;
    }


    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double baseLength1 = scan.nextDouble();
        double baseWidth1 = scan.nextDouble();
        double pyramidHeight1 = scan.nextDouble();

        System.out.print(calcPyramidVolume(baseLength1, baseWidth1, pyramidHeight1));


    }
}