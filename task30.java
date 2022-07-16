import java.util.*;
public class task30{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("entre the length of array: ");
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter next number to add to array : ");
            a[i]=sc.nextInt();

        }
        float sum= 0;

        for (int j=0;j<a.length;j++) sum = sum + a[j];
        System.out.println("Sum of array : "+ sum);
        System.out.println("Average of array : "+(sum/(a.length)));


    }

}
