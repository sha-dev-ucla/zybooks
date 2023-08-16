/*
Complete the method definition to return the hours given minutes. 
Output for sample program:
3.5
 */

import java.lang.*;
import java.util.*;

public class methodOne
{
    public static double getMinutesAsHours(double origMinutes) {

        /* Your solution goes here  */
        origMinutes = (origMinutes/60);
        return origMinutes;
  
     }



    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double minutes;
        minutes = scan.nextDouble();

        System.out.println(getMinutesAsHours(minutes));


    }




}