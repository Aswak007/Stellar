package Day1;

import java.util.Scanner;

public class addofnumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        System.out.println(A);
        System.out.println(addofnumber.solve(A));
    }

    private static int solve(int A) {
        int B = A % 10;
        int C = A/10;
        return (B+C);
    }
}