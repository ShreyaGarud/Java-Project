import java.util.*;
import java.lang.*;

public class Table {
    public static void main(String[] args) 
    {
        int num = 0;
        int i=1;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number:");
        num = s.nextInt();

        for(i=1;i<=10;i++)
        {
            System.out.println(+num+"*"+i+"="+(num*i));
        }

    }

    
}
