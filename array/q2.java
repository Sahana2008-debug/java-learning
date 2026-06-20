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
        if(size%2 == 0)
        {   
            int index = size/2;
            int middleleft = array[index-1];
            int middleright = array[index];
            System.out.print("Middle elements:");
            System.out.print(" "+ middleleft +" "+ middleright);  
        }
        else 
        {
            int index = size/2;
            int middle = array[index];
            System.out.print("Middle element:");
            System.out.print(" "+ middle);
        }
        

    }
}