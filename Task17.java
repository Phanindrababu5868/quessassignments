import java.io.*;
import java.util.*;
public class digitssum {
    static int sumdigit(int n){
        return n==0?0:n%10+sumdigit(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter you digits:");
        int n= sc.nextInt();
        System.out.println("sum of digits are : "+sumdigit(n));
    }
}
