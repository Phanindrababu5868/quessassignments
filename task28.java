import java.util.*;
public class task28 {
    public static  int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enten any number: ");
        int n = sc.nextInt();
        System.out.println("sum of numbers between "+n+" and 1 is : "+sum(n));
    }
}
