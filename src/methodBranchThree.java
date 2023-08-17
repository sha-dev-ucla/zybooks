/*
Define a method findParkingRate() that takes two integer parameters
as the number of parking visits and the parking duration,
and returns the daily parking price to be paid as an
integer. The price is returned as follows:

Ex: If the input is 5 5, then the output is:

22
*/
import java.lang.*;
import java.util.*;

public class methodBranchThree
{
    public static int findParkingRate(int parkVisits, int parkDuration)
    {
        if(parkVisits < 6)
        {
            if(parkDuration < 6)
            {
                return 22;
            }else if(parkDuration >= 6 && parkDuration <= 21)
            {
                return 21;
            }else
            {
                return 19;
            }
        }else if(parkVisits >= 6 && parkVisits <= 17)
        {
            if(parkDuration < 6)
            {
                return 14;
            }else if(parkDuration >= 6 && parkDuration <= 21)
            {
                return 13;
            }else
            {
                return 10;
            }
        }else
        {
            if(parkDuration < 6)
            {
                return 8;
            }else if(parkDuration >= 6 && parkDuration <= 21)
            {
                return 6;
            }else
            {
                return 4;
            }
        }

    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int parkCount = scan.nextInt();
        int parkTime = scan.nextInt();

    }

}