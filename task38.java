import java.util.*;
class AB{
    int a;
    public AB(int a){
        System.out.println("from class A, a = " + a);
    }
}
class BC extends AB{
    int b;
    public BC(int a,int b){
        super(a);
        System.out.println("from class B, b = "+b);

    }

}
class CD extends BC{
    int c;
    public CD(int a,int b,int c){
        super(a,b);
        System.out.println("from class C , c = "+c);

    }
    public void sum(int a,int b,int c){
        System.out.println("\n");
        System.out.println("square of a= "+a*a);
        System.out.println("square of b = "+b*b);
        System.out.println("square of c = "+c*c);

    }

}
public class task38 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers to find squares : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        CD add = new CD(a,b,c);
        add.sum(a,b,c);

    }

}
