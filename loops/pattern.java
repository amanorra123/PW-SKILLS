public class pattern {
    public static void main(String[] args) {
        int n = 5; //length of pattern
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j || i+j == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

