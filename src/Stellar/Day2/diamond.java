package Stellar.Day2;

public class diamond {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i<=row ; ++i) {
            for (int k = 1; k <=row-i; k++) {   //1st for loop invert (inverted mirror star)
                System.out.print(" ");
            }
            for (int j =1; j <=2*i-1; ++j) {      // j<=2*i-1  pyramid
                System.out.print("*");        // 1st for loop invert (inverted pyramid)
            }
            System.out.println();
        }
        for(int i = row-1;i>=1;--i ){
            for(int k=1;k<=row-i;++k){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
