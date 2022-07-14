import java.util.Scanner;
public class currency
{
    public static void main(String[] args)
    {
        
        System.out.println("please enter the currency :");
        Scanner sc=new Scanner(System.in);
        int currency=sc.nextInt();
        System.out.println("enter the number of currency :");
        int n=sc.nextInt();
        int noofcurrency=n;
        int reverse=0,remainder=0;;
        while(noofcurrency !=0) {
            remainder = noofcurrency % 10;
            reverse = reverse * 10 + remainder;
            noofcurrency = noofcurrency / 10;
        }
        if(reverse==n)
        {
            System.out.println(" 'congrats' your currency  become 3 times:"+(currency*3));

        }
        else {
            System.out.println("'sorry' your currency remains same : "+currency);
        }
    }

}
