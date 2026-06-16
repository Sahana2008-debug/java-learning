import java.util.Scanner;
class q2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = scan.nextLine();
        System.out.print("Enter Age:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter city:");
        String city = scan.nextLine();
        System.out.print(name+"\n"+age+"\n"+city);
    }
}