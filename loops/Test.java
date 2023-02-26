import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
            } else {
                sum = -1;
            }
        } while (number >= 0);

        System.out.println("Sum: " + sum);
    }
}
