import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, 3);
                num /= 10;
            }

            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}
