//If mark is greater than 35 print pass or else print fail.
import java.util.Scanner;
class q1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the mark:");
        int mrk = scan.nextInt();
        if(mrk>34)
        System.out.print("Pass");
        else
        System.out.print("Fail");
    }
}