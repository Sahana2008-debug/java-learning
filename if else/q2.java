//If income >7000 scholarship is available.else not available.
import java.util.Scanner;
class q2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter salary:");
        int sal = scan.nextInt();
        if (sal>=7000)
        System.out.print("Eligible for Scholarship.");
        else
        System.out.print("Not eligible for Scholarship.");
    }
}