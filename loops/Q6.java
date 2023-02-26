public class Q6 {
    public static void main(String[] args) {
        int n = 5;
        int num = 0;
        int alpha = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print((char) (alpha + num++));

            }
            num = 0;
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (n-i) * 2 - 1; k > 0; k--) {
                System.out.print((char) (alpha + num++));

            }
            num = 0;
            System.out.println();
        }
    }
}
