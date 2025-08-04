package logic;

public class palindrome {
    public static boolean isPalindrome(int n) {
        int original = n;
        int rem = 0;

        while(n > 0) {
            int x = n % 10;
            rem = rem * 10 + x;
            n = n / 10;
        }

        return rem == original;
    }

    public static void main(String[] args) {
        int n = 5445;
        System.out.println("Palindrome: " + isPalindrome(n));
    }
}
