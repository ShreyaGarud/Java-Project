import java.util.*;
import java.lang.*;

public class Day {
    public static void main(String[] args) {
        int Dayno = 0;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter Day No(1-7):");
        Dayno=s.nextInt();

        if(Dayno == 1)
        {
            System.out.println("Monday");
        }
        else if(Dayno == 2)
        {
            System.out.println("Thuesday");
        }
        else if(Dayno == 3)
        {
            System.out.println("Wedesday");
        }
        else if(Dayno == 4)
        {
            System.out.println("Friday");
        }
        else if(Dayno == 5)
        {
            System.out.println("Satarday");
        }
        else if(Dayno == 6)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Day");
        }
    }
    
}
