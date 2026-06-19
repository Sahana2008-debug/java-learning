//Create an integer array, Get input for 5 numbers and print their sum or total
import java.util.Scanner;
class q1
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[] integer = new int[5];
        int sum =0;
        System.out.print("Enter integers:");
        for(int i=0;i<5;i++)
        {
            integer[i] = scan.nextInt();
        }
        for(int i=0; i<5;i++)
        {
            sum = sum + integer[i];
        }
        System.out.print("The sum is"+" "+sum);
    }
}