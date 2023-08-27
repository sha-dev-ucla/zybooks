/*
Define a default constructor that initializes the fields gasTank (integer), 
renter (string), and mileage (integer) with the default values 1, 
"Unspecified", and 1, respectively.

Ex: If the input is 93 Eli 90000, then the output is:

Default values: 
Gas tank: 1, Renter: Unspecified, Mileage: 1
After mutator methods: 
Gas tank: 93, Renter: Eli, Mileage: 90000
*/

import java.util.Scanner;

public class CarShopTwo
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int gasVal = scnr.nextInt();
        String renterVal = scnr.next();
        int milesVal = scnr.nextInt();

        Car xr = new Car();
        xr.print();

        System.out.println("After mutator methods: ");

        xr.setTank(gasVal);
        xr.setRenter(renterVal);
        xr.setMiles(milesVal);

        xr.print();

        scnr.close();
    }
    
}
