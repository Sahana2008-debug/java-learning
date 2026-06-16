/* Get input for salary and age
if salary>= 20000 or age<=25 get input for loan amount if not print not eligible
if loan<=50000 print eligible for loan else print maximum amount is 50000.*/
import java.util.Scanner;
class q4
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Salary");
        int salary= scan.nextInt();
        System.out.print("Enter age");
        int age = scan.nextInt();
        if(salary>=20000 || age<=25)
        {
            System.out.print("Enter loan amount:");
            int loan = scan.nextInt();
            if(loan <= 50000)
            {
                System.out.print("Eligible for loan.");
            }
            else
            {
                System.out.print("Maximum loan amount is 50,000.");
            }
        }
        else
        {
            System.out.print("Not eligible for loan.");
        }
    }

}