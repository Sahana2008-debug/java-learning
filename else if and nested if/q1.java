/* What is the score in a game?
-if the score is less than 50: print "You need to improve."
-if the score is btw 50 and 70: print "good job!"
-if the score is greater than 70: print "Excellent Performance."*/
import java.util.Scanner;
class q1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Score of the game:");
        int num = scan.nextInt();
        if(num<50)
        {
            System.out.print("You need to improve.");
        }
        else if(num>=50 && num<=70)
        {
            System.out.print("Good Job!");
        }
        else
        {
            System.out.print("Excellent Performance");
        }
    }
}