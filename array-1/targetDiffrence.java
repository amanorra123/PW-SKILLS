import java.util.Scanner;

public class targetDiffrence {
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
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[i]==target){
                    System.out.println("yes");
                    return;
                }
            }
        }
        System.out.println("no");
    }
}
