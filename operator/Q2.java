import java.util.Scanner;

//Swap two numbers without the use of third variable.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number one:");
        int x=sc.nextInt();
        System.out.println("enter the second number:");
        int y=sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);
    }

}
