/*Get input for two integer number
 find which number is greater using ternary operator*/ 
 import java.util.Scanner;
 class q5
 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.print("The greater number is:");
        System.out.print(num1>num2?num1:num2);
    }
 }