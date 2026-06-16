import java.lang.System;
import java.util.Scanner;
class q1
{
    public static void main (String args[])
    {   
        System.out.print("Enter name:");
        Scanner variable = new Scanner(System.in);
        String name = variable.nextLine();
        System.out.println(name);
        System.out.print("Enter Age:");
        int age = variable.nextInt();
        System.out.print(age);
        
    }
}