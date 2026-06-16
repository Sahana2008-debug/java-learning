/*What is the color of the traffic light:
-if red: print "Stop".
-if yellow: print "Get ready".
-if Green: print "Go".*/
import java.util.Scanner;
class q3
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the signal:");
        String signal = scan.nextLine();
        if(signal.equals("red"))
        {
            System.out.print("Stop");
        }
        else if(signal.equals("yellow"))
        {
            System.out.print("Get ready");
        }
        else if(signal.equals("green"))
        {
            System.out.print("Go");
        }
    }
}