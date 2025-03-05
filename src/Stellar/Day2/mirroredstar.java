package Stellar.Day2;

public class mirroredstar {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i<=row ; ++i) {
            for (int k = 1; k <=row-i; k++) {   //1st for loop invert (inverted mirror star)
                System.out.print(" ");
            }
            for (int j =1; j <=i; ++j) {      // j<=2*i-1  pyramid
                System.out.print("*");        // 1st for loop invert (inverted pyramid)
            }
            System.out.println();
        }
    }
}

