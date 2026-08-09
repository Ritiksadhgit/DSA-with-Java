import java.util.*;

public class CountOfDigitsInNum {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int count=0;
       if(num<0){
        num=-num;
       }
       for(;num > 0;num=num/10){
       
        count++;
        
       }
       System.out.print(count);
    }
}