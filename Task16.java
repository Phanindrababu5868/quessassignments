import java.util.*;
public class Q16primefactor {
    public static  int primefactors (int n){
        int c=2;
        while(n>1){
            if(n%c==0){
                System.out.println(c);
                n= n/c;
            }
            else{
                c=c+1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter any number: ");
        int s= sc.nextInt();
        System.out.println(" prime factors are:");
        int re = primefactors(s);
        System.out.println(" ");

    }
}
