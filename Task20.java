import java.util.Scanner;

public class armstrong
{
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower range :");
        num1 = sc.nextInt();
        System.out.println("enter the upper range : ");
        num2  = sc.nextInt();
        System.out.println("Armstrong number between "+num1+" and "+num2+ " are : ");
        for (int i = num1;i<num2;i++)
        {
            int check,rem,sum=0;
            check =i;
            while (check != 0)
            {
                rem = check %10;
                sum = sum+(rem*rem*rem);
                check =check/10;


            }
            if(sum ==i){
                System.out.println(i+" ");
            }
        }
    }

}
