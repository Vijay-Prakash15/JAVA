package logic;

public class count {
    public static void countNumbers(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 67890;
        System.out.print("Count of digits in " + n + " is: ");
        countNumbers(n);  // corrected method name
    }
}
