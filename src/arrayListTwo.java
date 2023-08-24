/*
Integer numHeights is read from input. Then, numHeights integers are 
read from input and inserted at the end of heightList. Output every 
element that is divisible by 4 in heightList. 
End each output with a space.

Ex: If the input is:

2
28 34

then the output is:

28 

Note: Integer i is divisible by 4 if i % 4 == 0.
*/
import java.lang.*;
import java.util.*;
public class arrayListTwo
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> heightList = new ArrayList<Integer>();
        int numHeights = scan.nextInt();
        
        for(int i =0; i<numHeights;i++)
        {
            heightList.add(scan.nextInt());
        }

        for(int i =0; i<numHeights;i++)
        {
            if(heightList.get(i) % 4 == 0)
            {
                System.out.print(heightList.get(i) + " ");
            }
        }

    }
    
}