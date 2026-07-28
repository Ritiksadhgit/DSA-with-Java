import java.util.*;

public class Threenumber {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
                int num1=sc.nextInt();
                
                
                if(num1>99 && num1<1000 || num1<-99 && num1>-1000) {
                    System.out.print("Yes");
                }
               
                else {
                    System.out.print("No");
                }
                
    }
}
