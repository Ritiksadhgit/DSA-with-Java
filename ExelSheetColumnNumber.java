import java.util.*;

class ExelSheetColumnNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String columnTitle = sc.nextLine();

        ExelSheetColumnNumber obj = new ExelSheetColumnNumber();

        int result = obj.titleToNumber(columnTitle);

        System.out.println(result);

        sc.close();
    }

    public int titleToNumber(String columnTitle) {

        int len = columnTitle.length() - 1;
        int sum = 0;
        int count = 0;

        int c, d;

        for (int i = len; i >= 0; i--) {

            c = (int) Math.pow(26, count);

            d = columnTitle.charAt(i) - 64;

            sum = sum + c * d;

            count++;
        }

        return sum;
    }
}