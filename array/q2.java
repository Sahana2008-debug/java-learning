/* Get input for size of an array
Get input for each element in an array
Find and print middle element of an array*/
import java.util.Scanner;
class q2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            array[i]= scan.nextInt();
        }
        

    }
}