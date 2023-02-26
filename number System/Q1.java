import java.util.Scanner;

//Convert a decimal number into binary
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int ans=0;
        int pw=1;
        while (num>0){
            int parity=num%2;
            ans+=(parity*pw);
            pw*=10;
            num/=2;
        }
        System.out.println(ans);
    }
}
