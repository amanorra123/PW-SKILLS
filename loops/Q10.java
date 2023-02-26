import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        for (int i=1;i*i<=num;i++){
            System.out.print(i*i+" ");
        }
    }
}
