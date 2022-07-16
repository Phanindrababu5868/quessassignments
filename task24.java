import java.util.*;
public class taks24 {
    public static void main(String[] args) {
        char mar_status;
        Scanner sc = new Scanner(System.in);
        System.out.println("Are u married? (Y/N): ");
        mar_status = sc.next().charAt(0);
        if (mar_status == 'Y') {
            System.out.println("'congrats'  your eligible for company insurance ");
        } else {
            System.out.println("Enter the gender? (M/F):");
            char gender = sc.next().charAt(0);
            System.out.println("Enter your age :");
            int age = sc.nextInt();
            if (gender == 'M' && age > 30 || gender == 'F' && age >= 25) {
                System.out.println("'Congrats' your eligible for company insurance");
            } else {

                System.out.println("Sorry to say This --> your not eligible for insurance");
            }
        }
    }
}
