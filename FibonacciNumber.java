import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long first = 0;
        long second = 1;
        long next = 0;

        if (n == 1) {
            System.out.println(0);
        } 
        else if (n == 2) {
            System.out.println(1);
        } 
        else {
            for (int i = 3; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println(next);
        }
    }
}