//Print the number which are divisible by both 3 and 5.In the range 1 to 100.
import java.util.Scanner;
class q5
{
    public static void main(String args[])
    {
        System.out.print("Numbers divsible by 3 and 5 ");
        for (int i=1;i<=100;i++)
        {
            if(i%3 == 0 && i%5 == 0)
            System.out.print(i+" ");
        }
    }
}