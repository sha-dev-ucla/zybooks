/*
In the Bird class, complete the public method definition for setAge() 
with the integer parameter customAge.

Ex: If the input is beige 13, then the output is:

Color: beige
Age: 13
*/
public class Bird
{
    private String color;
    private int age;

    public void setColor(String userColor)
    {
        color = userColor;
    }
    public void setAge(int userAge)
    {
        age = userAge;
    }

    public String getColor()
    {
        return color;
    }
    public int getAge()
    {
        return age;
    }

}