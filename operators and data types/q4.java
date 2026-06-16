import java.util.Scanner;
class q4
{
    public static void main (String args[])
    {
        System.out.print("Enter Name,Score,Department:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double score = scan.nextDouble();
        scan.nextLine();
        String dept = scan.nextLine();
        System.out.print("My name is "+name+"\n"+"My score is "+score/10+"\n"+"My department is "+dept);
    
    }
}