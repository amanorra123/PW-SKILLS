import java.util.Scanner;

/*Given few lines of input(number of lines unknown) where each line has two
        strings, concatenate the strings.*/
public class Q5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter strings:");
        while(scn.hasNextLine()) {
            String a = scn.next();
            String b = scn.next();
            System.out.println(a + b);
        }
    }
}
