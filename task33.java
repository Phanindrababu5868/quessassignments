import java.util.Arrays;
import java.util.Scanner;
public class task33{
    public static int findSecLar(int[]num){
        Arrays.sort(num);
        int n= num.length;
        int res=num[n-1];
        for(int i=n-2;i>=0;i-- ){
            if(res>num[i]){
                res=num[i];
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter all the elements:");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("second largest element in array "+ findSecLar(arr));
    }
}
