import java.util.Scanner;

public class ReplaceZerosWithOnes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        
        String result = n.replace('0', '1');
        
        System.out.println(result);
    }
}