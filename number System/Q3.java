import java.util.Scanner;

//Add two numbers given in different base
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter binary number:");
        int num=sc.nextInt();
        System.out.println("enter a decimal number:");
        int decimal=sc.nextInt();
        int ans=0;
        int pw=1;
        while (num>0){
            int digit=num%10;
            ans+=(digit*pw);
            pw*=2;
            num/=10;
        }
        System.out.println(ans+decimal);
    }
}
