import java.util.*;
import java.lang.*;

public class Maxno {
    public static void main(String[] args) {
        int No1 = 0;
        int No2 = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a 1st Number:");
        No1=s.nextInt();
        System.out.println("Enter a 2nd Number:");
        No2=s.nextInt();

        if(No1>No2)
        {
            System.out.println("Number 1st is Maximum");
        }else if(No2>No1)
            {
                System.out.println("Number 2nd is Maximum");
            }
        
       
    }
}
