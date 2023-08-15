/*
Integer arrays individualPrices and numBought are read from input,
containing the prices and number bought of each item. Initialize
variable count with 0. For each item, increment count if an
item meets both of the following conditions:

Price is less than 20.
Number bought is an odd integer.
Lastly, output count followed by a newline.

Ex: For the input:

21 24 11 13
10 12 19 17
then the output is:

2
 */
import java.lang.*;
import java.util.*;

public class multipleArray3
{
    public static void main(String args[])
    {
        int NUM_VALS = 4;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        int[] individualPrices = new int[NUM_VALS];
        int[] numBought = new int[NUM_VALS];

        //Populate indvidualPrices
        for(int i =0;i<NUM_VALS;i++)
        {
            individualPrices[i] = scan.nextInt();
        }
        //Populate numBought
        for(int i =0;i<NUM_VALS;i++)
        {
            numBought[i] = scan.nextInt();
        }
        //Function to check both requirements
        for(int i =0;i<NUM_VALS;i++)
        {
            if(individualPrices[i] < 20 && (numBought[i] % 2) == 1)
            {
                count++;
            }
        }
        //Output final count value
        System.out.println(count);
    }

}