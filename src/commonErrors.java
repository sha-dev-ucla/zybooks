/*
Using the celsiusToKelvin method as a guide, create a new method, changing the name to kelvinToCelsius,
and modifying the method accordingly.
*/

import java.util.Scanner;

public class commonErrors {
   
      public static double kelvinToCelsius(double valueKelvin) {
      double valueCelsius;

      valueCelsius = valueKelvin - 273.15;

      return valueCelsius;
   }
   
    public static double celsiusToKelvin(double valueCelsius) {
      double valueKelvin;

      valueKelvin = valueCelsius + 273.15;

      return valueKelvin;
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double valueC;
      double valueK;

      valueC = 10.0;
      System.out.println(valueC + " C is " + celsiusToKelvin(valueC) + " K");

      valueK = scnr.nextDouble();
      System.out.println(valueK + "  is " + kelvinToCelsius(valueK) + " C");
   }
}