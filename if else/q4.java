// Check whether the number is even or odd.
import java.util.Scanner;
class q4
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scan.nextInt();
        if(num%2 == 0)
        {
            System.out.print("The given number is Even.");
        }
        else
        {
            System.out.print("The given number is odd.");
        }
    }
}