//Write a Java program to swap two numbers with the help of a third variable.
public class SWAPP {
    public static void main(String[] args) {
        int x=2;
        int y=3;
        int temp=x;
        x=y;
        y=temp;
        System.out.println("number after swapping:"+ x);
        System.out.println(y);
    }

}
