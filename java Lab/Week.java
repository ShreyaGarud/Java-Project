import java.util.*;
import java.lang.*;
import java.lang.invoke.SwitchPoint;

public class Week {
    public static void main(String[] args) {
        
        int Week=0;
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Week No(1-7):");
        Week=s.nextInt();
        switch(Week)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Thuesday");
                break;

            case 3:
                System.out.println("Wedesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

             default:
            System.out.println("Invalid Week");
        }
    }
}
