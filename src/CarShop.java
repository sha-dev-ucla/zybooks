/*
In the class definition, initialize the private fields renter (string) and mileage (integer) 
with the default values "Incomplete" and 0, respectively.

Ex: If the input is Mel 111000, then the output is:

Default values: 
Renter: Incomplete, Mileage: 0
After mutator methods: 
Renter: Mel, Mileage: 111000

Note: The class's print() method is called before and after the input is passed to the setters.
*/

import java.util.Scanner;

public class CarShop
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        String userRenter = scnr.next();
        int userMiles = scnr.nextInt();

        RentalCar xr = new RentalCar();

        System.out.println("Default values: ");
        xr.print();

        xr.setRenter(userRenter);
        xr.setMiles(userMiles);

        System.out.println("After mutator methods: ");

        xr.print();

        scnr.close();
    }


}