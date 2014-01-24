/**
 * Project Euler - problem 4
 * <p/>
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p/>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Dawid Stępień <https://github.com/dstepien>
 */

import java.util.ArrayList;

public class ProjectEuler_4 {
    public static void main(String[] args) {
        int result;
        int palindrome = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                result = i * j;

                if (isPalindromeNumber(result) && result > palindrome) {
                    palindrome = result;
                }
            }
        }

        System.out.println("The largest palindrome number is: " + palindrome);
    }

    private static boolean isPalindromeNumber(int number) {
        ArrayList<Integer> reversedDigits = new ArrayList<Integer>();
        int originalNumber = number;
        int reversedNumber = 0;
        int divisor = 10;
        boolean divide = true;

        while (divide) {
            reversedDigits.add((number % divisor) / (divisor / 10));
            number -= number % divisor;

            if (divisor - number > 0) {
                divide = false;
            } else {
                divisor *= 10;
            }
        }

        for (Integer element : reversedDigits) {
            divisor /= 10;
            reversedNumber += element * divisor;
        }

        return reversedNumber == originalNumber;
    }
}
