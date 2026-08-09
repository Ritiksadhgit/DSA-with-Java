import java.util.*;
public class SumOfOddInArray {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int d;
        for(;num>0;num=num/10) {
            d=num%10;
            if(d%2!=0) {
                sum+=d;
                
            }
        }
        System.out.print(sum);
    }
}
