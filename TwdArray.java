
import java.util.Scanner;

public class TwdArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,column;
        row=sc.nextInt();
        column=sc.nextInt();

        int arr[][]=new int[row][column];

        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=column-1;j++){
                arr[i][j]=sc.nextInt();
            }
        }

         for(int i=0;i<=row-1;i++){
            for(int j=0;j<=column-1;j++){
              System.out.print(arr[i][j]+" ");
              
            }
            System.out.println();
        }

    }
}
