import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String binary = sc.next();

        long decimal = Long.parseLong(binary, 2);

        String octal = Long.toOctalString(decimal);

        System.out.println(octal);
    }
}