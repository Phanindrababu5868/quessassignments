import java.util.*;
public class task27 {
    static void Table(int n,int i){
        //System.out.println("\n");
        System.out.println(n+"*"+i+'='+n*i);
        if(i<10){
            Table(n,i+1) ;
        }



    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number: ");
        int n=sc.nextInt();
        Table(n,1);
    }

}
