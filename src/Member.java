public class Member
{
    private String name;
    private double height;

    public void setName(String inName)
    {
        name = inName;
    }
    public void setHeight(double inHeight)
    {
        height = inHeight;
    }

    public String getName()
    {
        return name;
    }
    public double getHeight()
    {   
        return height;
    }

    public void print()
    {
        System.out.println("Member: " + name);
        System.out.println("Height: " + height + " feet");
    }


    
}
