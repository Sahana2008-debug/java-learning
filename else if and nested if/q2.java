/*Get input for five subjects marks. Add all of it and find average. 
-If average mark is less than 35:print "Additional Class is Required"
-Else : print "Good to go."*/
import java.util.Scanner;

    class q2{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the marks of 5 subjects:");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();
        int m4 = scan.nextInt();
        int m5 = scan.nextInt();
        int total = (m1+m2+m3+m4+m5);
        System.out.println("Total ="+total);
        int average = total/5;
        System.out.println("Average ="+average);
        if(average<35)
        {
            System.out.print("Additional class is required.");
        }
        else
        {
            System.out.print("Good to go.");
        }
    }}

