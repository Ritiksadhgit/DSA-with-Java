import java.io.*;
import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<size;i++) {
            if(target==arr[i]) {
                System.out.print(i);
                break;
            }
            else if(i==size) {
                System.out.print("-1");
            }
        }
    }
}
