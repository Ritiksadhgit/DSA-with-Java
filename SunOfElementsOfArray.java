import java.io.*;
import java.util.*;

public class SunOfElementsOfArray {

    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
       
       for(int i=0;i<arr.length;i++) {
        arr[i]=sc.nextInt();
        
       }
       int sum=0;
       for(int i=0;i<arr.length;i++) {
        
        sum+=arr[i];
       }
       System.out.print(sum);
    }
}
