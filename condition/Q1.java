//Write a program which takes the values of length and breadth from user and check if it is a square or
//        not.
import java.util.*;
    public class Q1
    {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int length;
            System.out.print("Enter the length : ");
            length=sc.nextInt();
            int breadth;
            System.out.print("Enter the breadth : ");
            breadth=sc.nextInt();
            if(length==breadth)
            {
                System.out.print("It is a square");
            }else{
                System.out.print("It is not a square");

        }
    }
}
