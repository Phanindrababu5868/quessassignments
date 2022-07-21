import java.util.*;
public class MaxMin {
    public int max(int arr[]){
        int maxnum= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxnum){
                maxnum=arr[i];
            }
        }
        return maxnum;

    }
    public int min(int arr[]){
        int minnum= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minnum){
                minnum=arr[i];
            }
        }
        return minnum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter length of array: ");
        int n=sc.nextInt();
        System.out.println("enter "+n+" elements :");
        int arr[]= new int[n];
        task35 m = new task35();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("minimum number in array : "+m.min(arr));
        System.out.println("maximum number in array  : "+m.max(arr));


    }
}
