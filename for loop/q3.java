//Print even number between 1 to 10 usinf for loop and if else.
import java.util.Scanner;
class q3
{
    public static void main(String args[])
    {
        System.out.print("Even numbers:");
        for (int i=1;i<=10;i++)
        {
            if(i%2 == 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}