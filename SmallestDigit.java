import java.util.*;

public class SmallestDigit {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       
       int min=9;
       for(int i=0;i<num;num=num/10){
             int digit=num%10;
             if(digit<min){
                min=digit;
                System.out.print(digit);
             }
             else if(digit==0) {
                System.out.print(min);
             }
       }
       
    }
}