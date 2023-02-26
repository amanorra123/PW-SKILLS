import java.util.Scanner;

class  area{
    int length;
    int breath;
    public area(int l,int b){
        length=l;
        breath=b;
    }
    public int GetArea(){
        return length*breath;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length:");
        int l=sc.nextInt();
        System.out.println("enter breath:");
        int b=sc.nextInt();
        area A=new area(l,b);
        System.out.println("area of rectangle is:"+A.GetArea());

    }
}
