/*
Integer numLengths is read from input. Then, numLengths integers 
are read from input and inserted at the end of lengthList. 
If an element is at an odd index in lengthList, 
multiply the element by 5.

Ex: If the input is:

3
36 46 11

then the output is:

36 230 11 

Note: Index i is odd if i % 2 != 0.
*/
import java.lang.*;
import java.util.*;

public class arrayListThree
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int numLengths = scan.nextInt();
        ArrayList<Integer> lengthList = new ArrayList<Integer>();

        for(int i = 0;i<numLengths;i++)
        {
            lengthList.add(scan.nextInt());
        }

        for(int i = 0;i<numLengths;i++)
        {
            if(i % 2 != 0)
            {
                lengthList.set(i, (lengthList.get(i) * 5));
            }
        }

        for(int i = 0;i<numLengths;i++)
        {
            System.out.print(lengthList.get(i) + " ");
        }

    }
}
