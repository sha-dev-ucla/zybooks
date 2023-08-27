public class Car
{
    private int userGas;
    private String userName;
    private int userMiles;


   public Car()
   {
    userGas = 1;
    userName = "Unspecified";
    userMiles = 1;
   }



    public void setTank(int tankVal)
    {
        userGas = tankVal;
    }
    public void setRenter(String renterName)
    {
        userName = renterName;
    }
    public void setMiles(int mileCount)
    {
        userMiles = mileCount;
    }
    
    
    public void print()
    {
        // Gas tank: 1, Renter: Unspecified, Mileage: 1
        System.out.println("Gas tank: " + userGas + ", Renter:  " + userName + ", Mileage: " + userMiles);
    }

    
}
