import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayInReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
            
        }
        
        for(int i=arr.length-1;i>=0;i--) {
           int a=arr[i];
            System.out.print(a+" ");
        }
        
    }
}
