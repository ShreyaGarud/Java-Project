import java.util.Scanner;

public class Dist_Kilometre {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Distance in Kilometre :");
        Double Kilometre = s.nextDouble();

        System.out.println("Distance" +Kilometre+ "kilometere");

        System.out.print("kilometers is equal to :"+ (int) (Kilometre*1000)+"meters");
    }
}
