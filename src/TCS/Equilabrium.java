package TCS;

import java.util.Scanner;

public class Equilabrium {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }

        System.out.println(Equilabrium.solve(A));

    }

    private static int solve(int[] A) {
        int N = A.length;
        for (int i = 1; i < N; ++i) {
            int l=0;
            for(int j=0;j<i;++j){
                l+=A[j];
            }
            int r=0;
            for(int j=i+1;j<N;++j){
                r+=A[j];
            }
            if(l==r) return i;
        }
        return -1;
    }
}