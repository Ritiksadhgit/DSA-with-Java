import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        public class Factorial {
            public static void main(String args[] ) throws Exception {
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int total=1;
          for(int i=1;i<=num;i++) {
            total=i*total;
          }
          System.out.print(total);
            }
        }