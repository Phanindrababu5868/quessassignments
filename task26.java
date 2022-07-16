import java.util.*;
public class task26 {
    public static void main(String[] args)
    {
        int unit;
        double amt,total,sur_charge;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units :");
        unit = sc.nextInt();
        if(unit<=50)
        {
            amt = unit*0.50;

        }
        else if (unit<=150)
        {
            amt = 50*0.5 + ((unit-50)*0.75);


        } else if (unit<=250) {
            amt = 50*0.5 + (100*0.75)+((unit-150)*1.20);

        }
        else {
            amt = 50*0.5 + (100*0.75)+(100*1.20)+((unit-250)*1.50);
        }
        sur_charge=amt*0.20;
        total=amt+sur_charge;
        System.out.println("Electricity Bill Amount = Rs "+total+ "/-");
    }
}
