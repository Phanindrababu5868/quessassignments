import java.util.*;
public class Q15factorcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        int temp=0;
        for( int i=1;i<=n;i++){
            if(n%i==0){
                temp+=1;

            }
            else{
                continue;
            }
        }
        System.out.println("total no of factors: "+temp);
    }
}
