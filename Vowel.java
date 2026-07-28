import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        public class Vowel {
            public static void main(String args[] ) throws Exception {
               Scanner sc=new Scanner(System.in);
               char var=sc.next().charAt(0);
               
               if(var=='a' || var=='e' || var=='o' || var=='u' || var=='i' ) {
                System.out.print("Vowel");
               }
               else{
                System.out.print("Consonant");
               }
            }
        }
