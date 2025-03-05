package Stellar.Day1;

import java.util.Scanner;

public class newarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int b : a) {
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println(a[3]);
    }
}
