import java.util.*;
public class task25 {
    public static void main(String[] args)
    {
        double basic_sal,HRA,TA,PF,DA,gross_sal,bonus;
        System.out.println("Enter your Basic Salary :");
        Scanner sc = new Scanner(System.in);
        basic_sal =sc.nextDouble();
        HRA = basic_sal*0.2;
        PF = basic_sal*0.12;
        DA = basic_sal*0.15;
        TA = basic_sal*0.10;
        System.out.println( "HA: "+HRA);
        System.out.println(" PF : "+PF);
        System.out.println("DA : "+DA);
        System.out.println("TA : "+TA);
        if(basic_sal>=20000)
        {
            bonus = basic_sal*0.1;

        }
        else {
            bonus = basic_sal*0.2;

        }
        System.out.println("bonus : "+bonus);
        gross_sal = (basic_sal+HRA+DA+TA+bonus)-PF;
        System.out.println(" Employee Gross Salary is: "+gross_sal);
    }

}
