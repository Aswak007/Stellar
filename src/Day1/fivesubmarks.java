package Day1;

import java.util.Scanner;

public class fivesubmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();
        if (s1 > 100 || s2 > 100 || s3 > 100 || s4 > 100 || s5 > 100) {
            System.out.println("Wrong info");
        } else {
            int t = (s1 + s2 + s3 + s4 + s5);
            int a = (t / 5);
            System.out.println("Average mark is :" + a);
            System.out.println("Total marks is :" + t);
        }
    }
}

