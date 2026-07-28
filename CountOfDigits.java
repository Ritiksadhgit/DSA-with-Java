import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        public class CountOfDigits {
            public static void main(String args[] ) throws Exception {
                Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          if(num==0) {
            System.out.print("1");
          }
          if(num<0) {
            num=-num;
          }
          
         int count=0;
          for(;num>0;num=num/10) {
            
          count++;
          
          }
          System.out.print(count);
            
            }
        }
