import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number;
        do {
            System.out.print("Input number = ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
        } while (number <= 0);

        int reverseNumber = isReverse(number);
        System.out.println(reverseNumber);

        boolean result = isPalindrome(number, reverseNumber);
        if (result) {
            System.out.println(number + " la so doi xung.");
        } else {
            System.out.println(number + " khong phai la so doi xung.");
        }

    }

    private static int isReverse(int number) {
        int reverseNumber = 0;
        int temp = number;
        while(temp > 0) {
            reverseNumber = reverseNumber * 10 + temp % 10;
            temp /= 10;
        }
        return reverseNumber;
    }

    private static boolean isPalindrome(int number, int reverseNumber) {
        return number == reverseNumber;
    }
}

