/*
In the Store class, declare the following private fields:

integer numEmployees
integer numSold
integer yearsOpen
and define the following public methods:

setNumEmployees() has one integer parameter and assigns the numEmployees field with the parameter.
setNumSold() has one integer parameter and assigns the numSold field with the parameter.
setYearsOpen() has one integer parameter and assigns the yearsOpen field with the parameter.
Ex: If the input is 15 115 21, then the output is:

Number of employees: 15
Number of items sold: 115
Years open: 21
Note: If a field is not properly declared as private, an error message will be output.
*/
import java.util.Scanner;

public class StoreData
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int valEmployee = scnr.nextInt();
        int valSold = scnr.nextInt();
        int valYears = scnr.nextInt();

        Store xr = new Store();


        xr.setNumEmployees(valEmployee);
        xr.setNumSold(valSold);
        xr.setYearsOpen(valYears);

        System.out.println("Number of employees: " + xr.getNumEmployees());
        System.out.println("Number of items sold: " + xr.getNumSold());
        System.out.println("Years open: " + xr.getYearsOpen());

        scnr.close();
    }
}
