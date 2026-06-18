//Count the number of odd number from 1 to 10.
import java.util.Scanner;
class q4
{
    public static void main(String args[])
    {   
        int count = 0;
        System.out.print("Number of odd numbers:");
        for(int i=1;i<=10;i++)
        {
            if(i%2 != 0)
            count++;

        }
        System.out.print(count);
    }
}