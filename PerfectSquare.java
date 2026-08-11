import java.util.*;

public class PerfectSquare {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        boolean found=false;
        
        if(n == 0 || n == 1) {
            System.out.print(true);
            return;
        }

        for(int i=1;i<=n/2;i++){
            
            if(i*i==n){
                found=true;
                break;
            }
            
        }
        if(found) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
        
    }
}