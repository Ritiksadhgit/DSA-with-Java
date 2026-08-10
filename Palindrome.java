
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        for (; num > 0; num = num / 10) {

            int rem = num % 10;

            reverse = reverse * 10 + rem;
        }

        if (original == reverse) {
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }
}