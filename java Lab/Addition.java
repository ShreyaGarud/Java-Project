import java.util.*;
import java.lang.*;

public class Addition
{
    public static void main(String [] args)
    {
        int no1=0;
        int no2=0;
        int sum=0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no1");
        no1 = s.nextInt();
        System.out.println("Enter the no2");
        no2 = s.nextInt();
        
        sum = no1+no2;
        System.out.print("Addtion of two no\n"+sum);

    }

}

