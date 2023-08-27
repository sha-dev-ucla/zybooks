/*
Define the Member class's setName() mutator to set the field name to inputName 
and the setHeight() mutator to set the field height to inputHeight.

Ex: If the input is Eve 5.5, then the output is:

Member: Eve
Height: 5.5 feet
*/
import java.util.Scanner;

public class MemberData {
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        String userName = scnr.next();
        double userHeight = scnr.nextDouble();

        Member xr = new Member();
        xr.setName(userName);
        xr.setHeight(userHeight);

        xr.print();

        scnr.close();

    }
    
}
