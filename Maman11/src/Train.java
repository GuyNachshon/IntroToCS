import java.util.Scanner;
public class Train
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter 4 integers ");
        System.out.println ("Please enter the speed of train 1:");
        int v1 = scan.nextInt();
        System.out.println ("Please enter the time of train 1:");
        int t1 = scan.nextInt();
        System.out.println ("Please enter the speed of train 2:");
        int v2 = scan.nextInt();
        System.out.println ("Please enter the time of train 2:");
        int t2 = scan.nextInt();
        int train1Distance = t1 * v1;
        int train2Distance = t2 * v2;

        float trainsDistance = Math.abs(train1Distance - train2Distance);
        String finalMessage = String.format("The distance between the trains is %s Km.", trainsDistance);
        System.out.print(finalMessage);
    }
}
