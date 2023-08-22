/*
In the Wasp class, declare the following private fields:

string color
integer age
and define the following public methods:

getColor() has no parameters and returns the color field.
getAge() has no parameters and returns the age field.
Ex: If the input is beige 19, then the output is:

Color: beige
Age: 19
Note: If a field is not properly declared as private, an error message will be output.
*/


public class Wasp {

    private String color;
    private int age;

    public String getColor()
    {
        return color;
    }
    public int getAge()
    {
        return age;
    }

    public void setColor(String userColor)
    {
        color = userColor;
    }
    public void setAge(int userAge)
    {
        age = userAge;
    }
    
}
