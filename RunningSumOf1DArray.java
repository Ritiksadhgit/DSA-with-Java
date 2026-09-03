import java.util.Scanner;

public class RunningSumOf1DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Running Sum
        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        // Output
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}