import java.util.Scanner;

public class bignum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,output;
        System.out.println("enter the first number :");
        a=sc.nextInt();
        System.out.println("enter the second number :");
        b=sc.nextInt();
        System.out.println("enter the third number :");
        c=sc.nextInt();
        System.out.println("enter the fourth number :");
        d=sc.nextInt();
        output=(a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>d)?c:d;
        System.out.println("The greater number among the four numbers is :"+output);


    }
}
