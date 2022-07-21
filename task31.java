import java.util.*;
public class task31{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of string to want to sort: ");
        int n=sc.nextInt();
        String nm[] = new String[n];
        Scanner str=new Scanner(System.in);

        int i,j;
        String t;
        for(i=0;i<n;i++){
            System.out.println("Enter string " +(i+1));
            nm[i] =str.next();
        }
        int l=nm.length;
        for(i=0;i<l-1;i++){
            for(j=0;j<((l-1)-i);j++){
                if(nm[j].compareTo(nm[j+1])>0){
                    t=nm[j];
                    nm[j]=nm[j+1];
                    nm[j+1] =t;
                }
            }

        }
        System.out.println("After sorting ......");
        for(i=0;i<n;i++){
            System.out.print(nm[i]+" ");
        }
    }
}
