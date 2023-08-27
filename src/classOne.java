/*
Print person1's kids, call the incNumKids() method, and print again, outputting text as below. 
End each line with a newline.

Sample output for below program with input 3:
Kids: 3
New baby, kids now: 4
*/

import java.util.Scanner;

public class classOne
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int numKids = scnr.nextInt();

        classOnez k = new classOnez();


        k.setCount(numKids);
        k.incKidCount();
        
        System.out.println("Kids: " + numKids);
        System.out.println("New baby, kids now: " + k.getCount());

        scnr.close();
    }


}