//Get input for a variable a and b and print the number from a to b
import java.util.Scanner;
class q2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a and b :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i=a;i<=b;i++)
        {
            System.out.print(i+" ");
        }
    }
}