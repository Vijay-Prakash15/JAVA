package logic;
public class reverse {
    public static int ReverseNumber(int n) {
        int sign = 1;
        if (n < 0) {
            sign = -1;       // remember it's negative
            n = -n;          // make it positive to reverse
        }

        int r = 0;
        while(n > 0) {
            int x = n % 10;
            r = r * 10 + x;
            n = n / 10;
        }

        return r * sign;     // make it negative again if needed
    }

    public static void main(String[] args) {
        int n = -5643;
        System.out.println("Reverse a number: " + ReverseNumber(n));
    }
}
