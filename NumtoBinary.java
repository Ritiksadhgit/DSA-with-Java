import java.util.*;

public class NumtoBinary {
    public static void main(String[] args) {

    Scanner sc=new Scanner (System.in);
    int num=sc.nextInt();

    String Binary=" ";
    
    while(num>0){
        int rem=num%2;
        Binary=rem+Binary;
        num=num/2;
    }
    System.out.println(Binary);
}
}
