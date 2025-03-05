package Day1;

public class checkprime {
    public static void main(String[] args) {
        int number = 6; // Example number
        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }
}