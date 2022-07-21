import java.util.*;
public class task37 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter numbers or rows of matrix :");
        int row= sc.nextInt();
        System.out.println(" Enter number of columns of matrix : ");
        int col=sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter "+row*col+" elements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Transpose matrix  :");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }



    }
}
