import java.util.*;
import java.util.Scanner;

public class task36 {
    public int[] insert(int[] arr, int n, int pos, int val) {
        int[] newarr;
        if (pos > n) {
            newarr = new int[pos + 1];
            for (int i = 0; i < pos + 1; i++) {
                if (i < n)
                    newarr[i] = arr[i];
                if (i == pos) {
                    newarr[pos] = val;
                }
            }
        } else {
            newarr = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                if (i < pos)
                    newarr[i] = arr[i];
                else if (i == pos) {
                    newarr[i] = val;
                } else {
                    newarr[i] = arr[i - 1];
                }
            }
        }
        return newarr;
    }

    public static int [] removeTheElement(int[] arr, int index) {
        if (arr == null || index<0||index>=arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];

        }

        return anotherArray;
    }


    public int Search(int[] num, int k) {
        for(int i=0;i<num.length;i++){
            if(num[i]==k){return i;}
        }
        return -1;
    }

    public void Display(int[] arr) {
        System.out.print("[");

        for (int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println("]");
    }

    public void Input(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

    }

    public void sum(int[] arr) {
        int s = 0;
        for (int j : arr) {
            s = s + j;
        }
        System.out.println(s);
    }

    static void average(int[] arr) {
        float s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        System.out.println(s / arr.length);
    }

    static void reverse(int[] a) {
        int[] b = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        System.out.print("Reversed array is: [ ");
        for (int k = 0; k < a.length; k++) {
            System.out.print(b[k] + " ");
        }
        System.out.print("]");

    }

    public static int findSecLar(int[] num) {
        Arrays.sort(num);
        int n = num.length;
        int res = num[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (res > num[i]) {
                res = num[i];
                break;
            }
        }
        return res;
    }

    static int unique(int a[]) {
        int res = 1;
        for (int i = 1; i < a.length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j)
                res++;

        }
        return res;
    }



    public int max(int arr[]) {
        int maxnum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxnum) {
                maxnum = arr[i];
            }
        }
        return maxnum;

    }

    public int min(int arr[]) {
        int minnum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minnum) {
                minnum = arr[i];
            }
        }
        return minnum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task36 obj = new task36();
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("first insert element in array");
        obj.Input(arr, n);
        while (true) {
            System.out.println("\n");
            System.out.println("<--><--><--><--><--><--><--><--><--><--><--><--><--><--><--><--><--><-->");
            System.out.println("""
                    Choose 1 --> For Element  SEARCH .
                    Choose 2 --> For Element  INSERTION 
                    Choose 3 --> For Element  DELETE.
                    Choose 4 --> For Element  DISPLAY .
                    Choose 5 --> For Element  SUM OF ARRAY  .
                    Choose 6 --> For Element  AVERAGE OF ARRAY .
                    Choose 7 --> For Element  REVERSE OF ARRAY .
                    Choose 8 --> For SECOND LARGEST number in Array.
                    Choose 9 --> For UNIQUE NUMBERS COUNT in Array.
                    choose 10--> For SMALL and LARGE NUMBER of array.
                    Choose 0 --> For EXIT . """);
            System.out.println("<--><--><--><--><--><--><--><---><--><--><--><--><--><--><--><--><--><-->");

            System.out.println("Enter  your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter number to search: ");
                    int p = sc.nextInt();
                    int search = obj.Search(arr, p);
                    if(search==-1){
                        System.out.println("element not found ");
                    }
                    else{
                        System.out.println("element "+p+" found at "+(search+1)+" position ");
                    }
                    break;
                }
                case 2: {
                    System.out.println("This is your current array element ");
                    obj.Display(arr);
                    System.out.println("length of array is " + arr.length);
                    System.out.println("enter position where do you want to insert : ");
                    int index1 = sc.nextInt();
                    n = arr.length;
                    if (index1 < 0 || index1 > n) {
                        System.out.println("Choose correct position insertion not possible for given position ,because position  out off bound");
                    } else {
                        System.out.println("Enter the value");
                        int value = sc.nextInt();
                        arr = obj.insert(arr, n, index1-1, value);
                        System.out.println("\nArray with " + value + " inserted at position " + (index1)+ ":\n" + Arrays.toString(arr));
                    }
                    break;


                }
                case 3: {
                    System.out.println("....Original Array before deletion :.... " + Arrays.toString(arr));
                    System.out.println("Enter the position ");
                    int p = sc.nextInt();
                    arr= removeTheElement(arr, p-1);
                    System.out.println("After deletion array is : ");
                    System.out.println(Arrays.toString(arr));
                    break;
                }
                case 4: {
                    System.out.println("Current Array : ");
                    obj.Display(arr);
                    break;

                }
                case 5:
                    if (arr.length > 1) {
                        System.out.print("sum of array : ");
                        obj.sum(arr);
                    } else {
                        System.out.println("sum");
                    }
                    break;
                case 6:
                    if (arr.length > 1) {
                        System.out.println("Average of array is :");
                        average(arr);
                    } else {
                        System.out.println("Average calculation not possible for Given(empty Array)");
                    }
                    break;
                case 7:
                    if (arr.length > 1) {
                        reverse(arr);
                    } else {
                        System.out.println("Reverse of array not possible for given array length");
                    }
                    break;
                case 8:
                    System.out.println("Second largest number in array " + findSecLar(arr));
                    break;
                case 9:
                    if (arr.length > 0) {
                        System.out.println("Total unique number in Array " + unique(arr));
                    } else {
                        System.out.println("!! unique number finding not possible for given (Empty Array) !!");
                    }
                    break;
                case 10:
                    System.out.println("choose 1 For small number/choose 2 for large number ");
                    int c = sc.nextInt();
                    if (c == 1) {
                        System.out.println("small number in Array " + obj.min(arr));
                    } else if (c == 2) {
                        System.out.println("large number in Array " + obj.max(arr));
                    } else {
                        System.out.println("!! Wrong choice,choose correct option !!");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;


                default:
                    System.out.println("!! Wrong input ,Please choose any one of above choice only !!  ");
            }
        }
    }
}
