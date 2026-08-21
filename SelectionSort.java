
import java.util.*;

public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<size-1;i++) {
            int minindex=i;
            for(int j=i+1;j<size;j++){
                if(arr[minindex]>arr[j]){
                    minindex=j;
                }
            }
            int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;   
        }
         for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
    }
}