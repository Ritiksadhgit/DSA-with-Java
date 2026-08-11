         import java.util.*;
          
        public class PerfectNumber {
            public static void main(String args[] ) throws Exception {
                 Scanner sc = new Scanner(System.in);
                  int n = sc.nextInt();
                  int sum=0;
                  for(int i=1;i<n;i++){
                    
                    if(n%i==0){
                        sum=sum+i;
                    }
                    
                  }
                  if(sum==n){
                        System.out.print("YES");
                    }
                    else{
                        System.out.print("NO");
                    }
            }
        }
