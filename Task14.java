import java.util.*;
class numfactors{
    static void factors(int n){
        for(int i=1;i<=n;i++){
            if (n%i ==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        System.out.print("enter any number to find factors :");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(" factors of"+n+" are :");
        factors(n);
    }
}
