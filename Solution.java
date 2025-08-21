import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if (isStrongNumber(num)) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }

    public static boolean isStrongNumber(int n) {
        int originalNum = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }

        return sum == originalNum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
