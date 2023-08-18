/*
The method convertTime() has an integer parameter. Define a second convertTime()
method that has two integer parameters. The first parameter is the number of
hours and the second parameter is the number of minutes. The method should 
return the total number of minutes.

Ex: If the input is 3 2, then the output is:

3 hours yields 180 minutes.
3 hours and 2 minutes yields 182 minutes.
Note: The total number of minutes can be found using (hours * 60) + minutes.
*/

import java.util.Scanner;

public class methodOverloadThree {
   public static int convertTime(int hours) {
      return hours * 60;
   }

   /* Your code goes here */
   public static int convertTime(int hours, int minutes) {
      return ((hours * 60) + minutes);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int hoursUsed;
      int minutesUsed;
      int totalMinutes1;
      int totalMinutes2;
      
      hoursUsed = scnr.nextInt();
      minutesUsed = scnr.nextInt();
      
      totalMinutes1 = convertTime(hoursUsed);
      System.out.println(hoursUsed + " hours yields " + totalMinutes1 + " minutes.");
      
      totalMinutes2 = convertTime(hoursUsed, minutesUsed);
      System.out.print(hoursUsed + " hours and " + minutesUsed + " minutes yields ");
      System.out.println(totalMinutes2 + " minutes.");
   }
}