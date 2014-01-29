/**
 * Project Euler - problem 6
 *
 * The sum of the squares of the first ten natural numbers is,
 * <p/>
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p/>
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first
 * ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p/>
 * Find the difference between the sum of the squares of the first
 * one hundred natural numbers and the square of the sum.
 *
 * @author Dawid Stępień <https://github.com/dstepien>
 */
public class ProjectEuler_6 {
    public static void main(String[] args) {
        int sumOfTheSquares = 0;
        int squareOfTheSum = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfTheSquares += Math.pow(i, 2);
            squareOfTheSum += i;
        }

        int result = (int) Math.pow(squareOfTheSum, 2) - sumOfTheSquares;
        System.out.println("The difference between the sum of the squares and the square of the sum is: " + result);
    }
}
