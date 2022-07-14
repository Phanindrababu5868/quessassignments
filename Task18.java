import java.util.*;
class reversenum{
    static int reverse(int n){
        int re=0;
        int r;
        while(n>0){
            r=n%10;
            re=(re*10)+(r);
            n=n/10;
        }
        return re;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        System.out.println("Reverse number : " +reverse(n));
    }
}
