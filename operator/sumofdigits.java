import java.awt.*;
import java.util.Scanner;

//Write a program to calculate the sum of the digits of a 3-digit number.
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int x=sc.nextInt();
        int sum=0;
        while(x>0){
            sum+=x%10;
            x=x/10;
        }
        System.out.println("sum is:"+sum);
    }
}
