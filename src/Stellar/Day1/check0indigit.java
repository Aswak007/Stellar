package Stellar.Day1;

import java.util.*;

public class check0indigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean cz = false;
        while (n > 0) {
            int digit = n% 10;
            if (digit == 0) {
                cz = true;
                break;
            }
            n = n / 10;
        }
        if (cz) {
            System.out.println("The number contains a 0.");
        } else {
            System.out.println("The number does not contain a 0.");
        }
    }
}
