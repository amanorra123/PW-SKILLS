import java.util.Scanner;

//Input two different string and print them in same line.
public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string:");
        String first=sc.next();
        System.out.println("enter second string:");
        String second=sc.next();
        System.out.println(first+" "+second);

    }
}
