import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean negative = false;

        if (num < 0) {
            negative = true;
            num = -num;
        }

        int reverse = 0;

        for (; num > 0; num = num / 10) {

            int rem = num % 10;

            reverse = reverse * 10 + rem;
        }

        if (negative) {
            reverse = -reverse;
        }

        System.out.print(reverse);
    }
}