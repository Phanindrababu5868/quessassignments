import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, i, j, temp;
        System.out.printf("Enter lower bound of the interval: ");
        a = sc.nextInt();
        System.out.printf("\nEnter upper bound of the interval: ");
        b = sc.nextInt(); 
        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0){
                continue;
            }
            temp = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    temp = 0;
                    break;
                }
            }
            if (temp == 1){
                System.out.println(i);
            }
        }
                    
        
    }
}
