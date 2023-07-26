import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int[] arr = new int[n*m];
        int idx = 0;
        int row = 0;
        int col = 0;
        while(col < m){
            int i = row;
            int j = col;
            while(i >= 0 && j < m){
                arr[idx] = mat[i][j];
                idx++;
                i--;
                j++;
            }
            row++;
            if(row >= n){
                row = n-1;
                col++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
