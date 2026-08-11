import java.io.*;
import java.util.*;

public class SumOfPrime {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (; num > 0; num = num / 10) {

            int rem = num % 10;
            int count = 0;

            for (int i = 1; i <= rem; i++) {

                if (rem % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                sum = sum + rem;
            }
        }

        System.out.print(sum);
    }
}