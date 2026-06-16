import java.util.Scanner;
class q3
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a,b,c:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = (a*b*c);
        System.out.println("multiply "+d);
        int e = (a+b+c);
        System.out.println("addition "+e);
        System.out.print(d/e);

    }
}