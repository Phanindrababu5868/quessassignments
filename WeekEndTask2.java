import java.io.*;
import java.util.*;
public class task40 {
    static long deciTobin(int num){
        int[] bin_num = new int[500];
        int i = 0;
        while (num > 0){
            bin_num[i]=num%2;
            num=num/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(bin_num[j]);
        }

        return 0;
    }
    static void deciTooctal(int n){
        int[] oct_num= new int[500];
        int i=0;
        while(n!=0){
            oct_num[i] = n%8;
            n=n/8;
            i++;

        }
        for(int j=i-1;j>=0;j--){
            System.out.print(oct_num[j]);
        }
    }
    static void deciTohex(int n){
        int[] hex_num=new int[500];
        int i=0;
        while(n!=0){
            hex_num[i]=n%16;
            n=n/16;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            if(hex_num[j]>9){
                System.out.print((char)(55+hex_num[j]));
            }
            else{
                System.out.print(hex_num[j]);
            }

        }
    }
    public static int binTodeci(long binary){
        int decimalNumber = 0, i = 0;
        while (binary > 0){
            decimalNumber += Math.pow(2, i++) * (binary % 10);
            binary /= 10;
        }
        return decimalNumber;
    }
    public int binTooctal(long binary){
        int deci =binTodeci(binary);
        String octalString = Integer.toOctalString(deci);
        int oct=Integer.parseInt(octalString);
        return oct;
    }
    public static String bintohex(long binary){
        int deci_num = binTodeci(binary);
        String hex_num= Integer.toHexString(deci_num);
        hex_num = hex_num.toUpperCase();
        return hex_num;
    }
    public static int octTodeci(String n){
        int num=Integer.parseInt(n,8);
        return num;
    }
    public static void octTohex(String octnum){
        int d=Integer.parseInt(octnum,8);
        String hex= Integer.toHexString(d);
        System.out.println(hex);
    }
    public static String octTobin(String oct){
        int octal=Integer.parseInt(oct,8);
        String bin_val=Integer.toBinaryString(octal);
        return bin_val;
    }
    static int hexTodeci(String hex_val){
        int l=hex_val.length();
        int base=1;
        int dec=0;
        for(int i=l-1;i>=0;i--){
            if (hex_val.charAt(i) >= '0' && hex_val.charAt(i) <= '9') {
                dec+=(hex_val.charAt(i)-48) * (base);
                base=base*16;
            }
            else if(hex_val.charAt(i) >= 'A' && hex_val.charAt(i) <= 'F') {
                dec+=(hex_val.charAt(i)-55) * (base);
                base=base*16;
            }
        }
        return dec;
    }
    static String hexTobin(String hex){
        String binary ="";
        hex=hex.toUpperCase();
        HashMap<Character,String>hashMap= new HashMap<Character,String>();
        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");
        int i ;
        char ch;
        for(i=0;i<hex.length();i++){
            ch=hex.charAt(i);
            if(hashMap.containsKey(ch)){
                binary += hashMap.get(ch);
            }
            else{
                binary="invalid input ";
            }
        }
        return binary;
    }
    public static void  hexTooctal(String hex){
        int dec;
        int oct_num[]=new int [1000];
        dec=hexTodeci(hex);
        int i=1;
        while(dec !=0) {
            oct_num[i++] = dec % 8;
            dec = dec / 8;
        }
        for(int j=i-1;j>0;j--){
            System.out.print(oct_num[j]);
        }
        System.out.println("\n");
    }
    public static boolean isbin(long num){
        if(num==0||num==1||num<0){
            return false;
        }
        while (num != 0) {
            if (num % 10 > 1) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
    static int isoctal(String num){
        int n=Integer.parseInt(num);
        while(n>0){
            if ((n % 10) >= 8)
                return 0;
            else
                n = n / 10;
        }
        return 1;
    }
    public static boolean isHex(String s){
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if ((ch < '0' || ch > '9')
                    && (ch < 'A' || ch > 'F')) {
                return false;
            }
        }
        return true;
    }
    public static boolean isdeci(int n){
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')){
                return false;
            }
        }
        return true;
    }
    public static final String ANSI_YELLOW ="\u001B[33m";
    public static final String ANSI_GREEN ="\u001B[32m";
    public static final String ANSI_CYAN ="\u001B[36m";
    public static final String ANSI_BLUE ="\u001B[34m";
    public static final String ANSI_WHITE ="\u001B[37m";
    public static final String ANSI_RED ="\u001B[31m";
    public static final String ANSI_RESET ="\u001B[0m";

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        task40 add=new task40();
        do{
            System.out.println();
            System.out.println("|<-><--><--><--><--><--><--><--><--><--><--><--><--><--><--><->|");
            System.out.println("|                                                              |");
            System.out.println("|           NUMBER SYSTEM CONVERSION CALCULATOR                |");
            System.out.println("|                                                              |");
            System.out.println("|<-><--><--><--><--><--><--><--><--><--><--><--><--><--><--><->|");
            System.out.println("|CHOOSE YOUR INPUT NUMBER FORMAT                               |");
            System.out.println("|"+ANSI_GREEN+"Choose 1 -->  DECIMAL  NUMBER"+ANSI_RESET+"                                 |");
            System.out.println("|"+ANSI_CYAN+"Choose 2 -->  BINARY   NUMBER"+ANSI_RESET+"                                 |");
            System.out.println("|"+ANSI_BLUE+"Choose 3 -->  OCTAL    NUMBER"+ANSI_RESET+"                                 |");
            System.out.println("|"+ANSI_YELLOW+"Choose 4--> HEXADECIMAL NUMBER"+ANSI_RESET+"                                |");
            System.out.println("|"+ANSI_RED+"Choose 0-->EXIT"+ANSI_RESET+"                                               |");
            System.out.println("|<-><--><--><--><--><--><--><--><--><--><--><--><--><--><--><->|");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    int ch = 0;
                    do{
                        System.out.println("\n");
                        System.out.println("---------------------DECIMAL SYSTEM CALCULATOR------------------------------");
                        System.out.println("YOUR CONVERTING FROM DECIMAL FORMAT ,CHOOSE YOUR OUTPUT NUMBER FORMAT");
                        System.out.println(ANSI_CYAN + "Choose 1 -->  BINARY   NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Choose 2 -->  OCTAL    NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Choose 3--> HEXADECIMAL NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_RED+"Choose 0--> TO BACK TO MAIN MENU"+ANSI_RESET);
                        System.out.println("----------------------------------------------------------------------------");
                        ch = sc.nextInt();
                        switch (ch) {
                            case 1: {
                                System.out.print("Enter DECIMAL Number : ");
                                int num = sc.nextInt();
                                boolean a = isdeci(num);
                                if (a == true) {
                                    System.out.print(ANSI_CYAN + "Binary number is : ");
                                    deciTobin(num);
                                    System.out.println("\n" + ANSI_RESET);
                                } else {
                                    System.out.println(ANSI_RED + "!!WRONG INPUT ENTER CORRECT DECIMAL NUMBER ONLY" + ANSI_RESET);
                                }
                                break;

                            }

                            case 2: {
                                System.out.print("Enter DECIMAL Number : ");
                                int num1 = sc.nextInt();
                                boolean s=isdeci(num1);
                                if(s==true){
                                System.out.print(ANSI_BLUE + "Octal  number is : ");
                                deciTooctal(num1);
                                System.out.println("\n" + ANSI_RESET);
                                }
                                else{
                                    System.out.println(ANSI_RED + "!!WRONG INPUT ENTER CORRECT DECIMAL NUMBER ONLY" + ANSI_RESET);

                                }
                                }
                                break;

                            case 3: {
                                System.out.print("Enter DECIMAL Number : ");
                                int num2 = sc.nextInt();
                                boolean e =isdeci(num2);
                                if(e==true){
                                System.out.print(ANSI_YELLOW + "Hexadecimal number  is : ");
                                deciTohex(num2);
                                System.out.println("\n" + ANSI_RESET);
                                }
                                else{
                                    System.out.println(ANSI_RED + "!!WRONG INPUT ENTER CORRECT DECIMAL NUMBER ONLY" + ANSI_RESET);
                                    break;
                                }
                                }
                                break;
                            default:
                                System.out.println(ANSI_RED+"!!WRONG INPUT CHOOSE ANY ONE OF ABOVE CONVERSION ONLY!!"+ANSI_RESET);
                                break;
                            case 0:
                                System.out.println("BACK TO MAIN MENU ");
                                break;
                        }
                    }while (ch!= 0);
                    break;
                case 2:
                    int ch1;
                    do{
                        System.out.println("\n");
                        System.out.println("-----------------------BINARY SYSTEM CALCULATOR------------------------------");
                        System.out.println("YOUR CONVERTING FROM BINARY FORMAT ,CHOOSE YOUR OUTPUT NUMBER FORMAT");
                        System.out.println(ANSI_GREEN + "Choose 1 -->  DECIMAL  NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Choose 2 -->  OCTAL    NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Choose 3--> HEXADECIMAL NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_RED+"Choose 0--> TO BACK TO MAIN MENU"+ANSI_RESET);
                        System.out.println("----------------------------------------------------------------------------");
                        ch1 = sc.nextInt();
                        switch (ch1){
                            case 1:{
                                System.out.print("Enter  Binary Number : ");
                                long num = sc.nextInt();
                                boolean b = isbin(num);
                                if (b == true) {
                                    int d = binTodeci(num);
                                    System.out.print(ANSI_GREEN + "DECIMAL NUMBER is : " + d + ANSI_RESET);
                                    System.out.println("\n");
                                    break;
                                }
                                else{
                                    System.out.println(ANSI_RED + "!!WRONG INPUT BINARY NUMBER CONTAINS '0' AND '1' ONLY" + ANSI_RESET);
                                }
                            }
                            break;
                            case 2:{
                                System.out.print("Enter  Binary number : ");
                                long num = sc.nextInt();
                                boolean b = isbin(num);
                                if (b == true) {
                                    long c = add.binTooctal(num);
                                    System.out.print(ANSI_BLUE + "Octal Number is : " + c + ANSI_RESET);
                                    System.out.println("\n");
                                    break;
                                }
                                else{
                                    System.out.println(ANSI_RED + "!!WRONG INPUT BINARY NUMBER CONTAINS '0' AND '1' ONLY" + ANSI_RESET);
                                }
                            }
                            break;
                            case 3:{
                                System.out.print("Enter Binary Number : ");
                                long num = sc.nextInt();
                                boolean c = isbin(num);
                                if (c == true) {
                                    String a = add.bintohex(num);
                                    System.out.print(ANSI_YELLOW + "HEXADECIMAL NUMBER IS : " + a + ANSI_RESET);
                                    System.out.println("\n");
                                }
                                else{
                                    System.out.println(ANSI_RED + "!!WRONG INPUT BINARY NUMBER CONTAINS '0' AND '1' ONLY" + ANSI_RESET);
                                }
                            }
                            break;
                            default:{
                                System.out.println(ANSI_RED + "!! WRONG INPUT !!,please any one of above option only" + ANSI_RESET);
                                break;
                            }
                            case 0: {
                                System.out.println("BACK TO MAIN MENU");
                            }
                            break;
                        }
                    }while(ch1 !=0);
                    break;

                case 3:
                    int ch2;
                    do {
                        System.out.println("\n");
                        System.out.println("---------------------OCTAL SYSTEM CALCULATOR--------------------------------");
                        System.out.println("YOUR CONVERTING FROM OCTAL FORMAT ,CHOOSE YOUR OUTPUT NUMBER FORMAT");
                        System.out.println("CHOOSE YOUR OUTPUT NUMBER FORMAT");
                        System.out.println(ANSI_GREEN + "Choose 1 -->  DECIMAL  NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_CYAN + "Choose 2 -->  BINARY   NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_YELLOW + "Choose 3--> HEXADECIMAL NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_RED+"Choose 0--> TO BACK TO MAIN MENU"+ANSI_RESET);
                        System.out.println("---------------------------------------------------------------------------");
                        ch2 = sc.nextInt();
                        switch (ch2) {
                            case 1: {
                                System.out.print("Enter  Octal Number : ");
                                String num = sc.next();
                                int i = isoctal(num);
                                if (i == 1) {
                                    int d = octTodeci(num);
                                    System.out.print(ANSI_GREEN + "DECIMAL NUMBER  IS : " + d + ANSI_RESET);
                                    System.out.println("\n");
                                    break;
                                } else {
                                    System.out.println(ANSI_RED + "!!WRONG INPUT !! ENTER CORRECT OCTAL NUMBER ONLY" + ANSI_RESET);
                                    break;
                                }
                            }
                            case 2: {
                                System.out.print("Enter  Octal number : ");
                                String num = sc.next();
                                int i = isoctal(num);
                                if (i == 1) {
                                    String c = add.octTobin(num);
                                    System.out.print(ANSI_BLUE + "BINARY NUMBER IS : " + c + ANSI_RESET);
                                    System.out.println("\n");
                                    break;
                                } else {
                                    System.out.println(ANSI_RED + "!!WRONG INPUT !! ENTER CORRECT OCTAL NUMBER ONLY" + ANSI_RESET);
                                    break;
                                }
                            }
                            case 3: {
                                System.out.print("Enter Octal Number : ");
                                String num = sc.next();
                                int i = isoctal(num);
                                if (i == 1) {
                                    System.out.print(ANSI_YELLOW + "HEXADECIMAL NUMBER IS : ");
                                    octTohex(num);
                                    System.out.println("\n" + ANSI_RESET);
                                    break;
                                } else {
                                    System.out.println(ANSI_RED + "!!WRONG INPUT !! ENTER CORRECT OCTAL NUMBER ONLY" + ANSI_RESET);
                                    break;
                                }
                            }
                            default: {
                                System.out.println(ANSI_RED + "!! WRONG INPUT !!,please any one of above option only" + ANSI_RESET);
                                break;
                            }
                            case 0:
                                System.out.println("BACK TO MAIN MANU");
                                break;
                        }
                    }while(ch2!=0);
                    break;

                case 4:
                    int ch3;
                    do {
                        System.out.println("\n");
                        System.out.println("---------------------HEXADECIMAL SYSTEM CALCULATOR---------------------------");
                        System.out.println("YOUR CONVERTING FROM HEXADECIMAL FORMAT ,CHOOSE YOUR OUTPUT NUMBER FORMAT");
                        System.out.println(ANSI_GREEN + "Choose 1 -->  DECIMAL  NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_CYAN + "Choose 2 -->  BINARY   NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Choose 3 -->  OCTAL    NUMBER" + ANSI_RESET);
                        System.out.println(ANSI_RED+"Choose 0--> TO BACK TO MAIN MENU"+ANSI_RESET);
                        System.out.println("-----------------------------------------------------------------------------");
                        ch3 = sc.nextInt();
                        switch (ch3) {
                            case 1: {
                                System.out.print("Enter  Hexadecimal Number : ");
                                String num = sc.next();
                                boolean b = isHex(num);
                                if (b == true) {
                                    int a = add.hexTodeci(num);
                                    System.out.print(ANSI_GREEN + "DECIMAL NUMBER IS : " + a + ANSI_RESET);
                                    System.out.println("\n");
                                    break;
                                } else {
                                    System.out.println(ANSI_RED + "!!WRONG INPUT !! ENTER CORRECT HEXADECIMAL NUMBER ONLY" + ANSI_RESET);
                                }
                            }
                            case 2: {
                                System.out.print("Enter Hexadecimal number : ");
                                String num = sc.next();
                                boolean b = isHex(num);
                                if (b == true) {
                                    String c = add.hexTobin(num);
                                    System.out.print(ANSI_CYAN + "BINARY Number is : " + c + ANSI_RESET);
                                    System.out.println("\n");
                                    break;
                                } else {
                                    System.out.println(ANSI_RED + "!!WRONG INPUT !! ENTER CORRECT HEXADECIMAL NUMBER ONLY" + ANSI_RESET);
                                }
                            }
                            case 3: {
                                System.out.print("Enter Hexadecimal Number : ");
                                String num = sc.next();
                                boolean b = isHex(num);
                                if (b == true) {
                                    System.out.print(ANSI_BLUE + "OCTAL NUMBER IS : ");
                                    hexTooctal(num);
                                    System.out.println("\n" + ANSI_RESET);
                                    break;
                                } else {
                                    System.out.println(ANSI_RED + "!!WRONG INPUT !! ENTER CORRECT HEXADECIMAL NUMBER ONLY" + ANSI_RESET);
                                }
                            }
                            default: {
                                System.out.println(ANSI_RED + "!! WRONG INPUT !!,please any one of above option only" + ANSI_RESET);
                                break;
                            }
                            case 0:
                                System.out.println("BACK TO MAIN MENU ");
                                break;
                        }
                    }while(ch3!=0);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println(ANSI_RED + "!! 1WRONG INPUT !!,please any one of above option only" + ANSI_RESET);
                    break;
            }

        }while(true);
    }
}
