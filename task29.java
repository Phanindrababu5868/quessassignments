import java.util.*;

class pattern
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n=sc.nextInt();
        //int n=5;

        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println("");
        }
    }
}
