import java.util.*;
 class task32 {
     static int digit(int a[],int n){
         int res=1;
         for (int i=1;i<n;i++){
             int j=0;
             for(j=0;j<i;j++){
                 if(a[i] == a[j]){
                     break;
                 }
             }
             if(i==j)
                 res++;

         }
         return res;
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println(" Enter length of array:");
         int n = sc.nextInt();
         System.out.println(" enter elemets :");
         int sum[] = new int[n];
         for ( int i = 0; i < n; i++) {
             sum[i] = sc.nextInt();
         }
         System.out.println( "Total Unique elements: " +digit(sum,n));
     }
}
