import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
