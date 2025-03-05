package TCS;

import java.util.Scanner;

public class TwoFur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int w = scanner.nextInt();
        float x = ((4 * v) - w) / 2.0f;

        if ((w % 2 != 0) || w < 2 || w <= v) {
            System.out.println("INVALID INPUT");
            return;
        }

        System.out.printf("TW=%.2f FW=%.2f", x, v - x);
    }
}
