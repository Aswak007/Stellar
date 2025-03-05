package TCS;

public class RainWater {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = A.length;
        System.out.print(RainWater.solve(A,n));
    }

    private static int solve(int[] A, int N) {
        int res=0;
        for(int i=0;i<=N-1;++i){
            int left = A[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, A[j]);
            }

            int right = A[i];
            for (int j = i + 1; j < N; j++) {
                right = Math.max(right, A[j]);
            }

            res+= Math.min(left, right) - A[i];
        }
        return res;
    }
}