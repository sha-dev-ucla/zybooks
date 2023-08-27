public class RentalCar
{
    private String userRenterName = "Incomplete";
    private int mileCount = 0;
    

    public void setRenter(String userRenter)
    {
        userRenterName = userRenter; 
    }
    public void setMiles(int userMiles)
    {
        mileCount = userMiles;
    }

    public void print()
    {
        // Renter: Mel, Mileage: 111000
        System.out.println("Renter: " + userRenterName + ", Mileage: " + mileCount);
    }


}