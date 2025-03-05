package Day1;

import java.util.Scanner;

public class checkvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                System.out.println("Vowels are present");
                break;
            }
            System.out.println("Vowels not found");
            break;
        }
    }
}
