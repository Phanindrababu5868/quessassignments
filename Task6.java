import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        String inp ="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        inp=s.nextLine();
        String res="";
        for(int i=0;i<inp.length();i++)
        {
            char c=inp.charAt(i);
            int b=Integer.parseInt(String.valueOf(c));
            if(b<5)
            res+='0';
            else
            res+='1';
            
        }
        System.out.println("After replacement number : "+res);
        
    }
}
