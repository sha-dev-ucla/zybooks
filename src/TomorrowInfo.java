/*
Define the Tomorrow class's getWeather() accessor that gets field 
weather and the getTemperature() accessor that gets field 
temperature.

Ex: If the input is overcast 59.5, then the output is:

Tomorrow: overcast
Temperature: 59.5 degrees Celsius
*/
import java.util.Scanner;


public class TomorrowInfo
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        String userString = scnr.next();
        double userDouble = scnr.nextDouble();

        Tomorrow xr = new Tomorrow();

        xr.setWeatherString(userString);
        xr.setDouble(userDouble);

        System.out.println("Tomorrow: " + xr.getWeatherString());
        System.out.println("Temperature: " + xr.getDouble() + " degrees Celsius");

        scnr.close();



    }
    



}
