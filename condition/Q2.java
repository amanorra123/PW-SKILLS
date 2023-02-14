// Write a program to print absolute value of a number entered by the user.
    import java.util.*;
    public class Q2
    {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num;
            System.out.print("Enter the number : ");
            num=sc.nextInt();
            if(num<0)
            {
                num=num*-1;
            }
            System.out.print("The absolute value is : " + num);

    }
}
