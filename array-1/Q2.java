import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target:");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
                if(x==arr[i]){
                   count++;


            }
        }
        System.out.println(count);
    }
}
