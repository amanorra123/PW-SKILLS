import java.util.Scanner;

//Q2 - Convert a binary number to decimal
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter binary number:");
        int num=sc.nextInt();
        int ans=0;
        int pw=1;
        while (num>0){
            int digit=num%10;
             ans+=(digit*pw);
             pw*=2;
             num/=10;
        }
        System.out.println(ans);
    }
}
