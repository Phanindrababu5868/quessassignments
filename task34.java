import java.util.*;
public class task34 {
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of arry :");
        n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter numbers to add to array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String odd=" ";
        String even =" ";
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }
            else if(arr[i]%2!=0){
                odd =odd+arr[i]+" ";
            }
            else{
                even =even+arr[i]+" ";
            }
        }
        System.out.println("Odd number array : ["+odd+"]");
        System.out.println("Even array : ["+even+"]" );



    }
}

