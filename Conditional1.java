import java.io.*;
import java.util.*;

public class Conditional1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int num=   sc.nextInt();
        
        if(num%3==0 && num%5==0) {
            System.out.print("Hello World");
            
            
        }
        else if(num%5==0) {
            System.out.print("Hello");
        }
        else if(num%3==0) {
            System.out.print("World");
        }
        else{
            System.out.print("Error");
        }
        
    }
}
