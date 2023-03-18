import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,4,2,2,2,2,2,3,7,7};
        for (int i=0;i<arr.length;i++){
           if(arr[i]>arr[i+1]){
               System.out.println(arr[i]);
               break;
           }
        }

    }
}
