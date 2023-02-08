
//If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
//        to calculate his total marks and percentage marks.
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks1:");
        int marks1=sc.nextInt();
        System.out.println("enter marks2:");
        int marks2=sc.nextInt();
        System.out.println("enter marks3:");
        int marks3=sc.nextInt();
        int total=marks1+marks2+marks3;
        int percentage=total/3;
        System.out.println("total="+total);
        System.out.println("percentage="+percentage);
    }
}
