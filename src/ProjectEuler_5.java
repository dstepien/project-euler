/**
 * Project Euler - problem 5
 * <p/>
 * 2520 is the smallest number that can be divided by each of
 * the numbers from 1 to 10 without any remainder.
 * <p/>
 * What is the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20?
 *
 * @author Dawid Stępień <https://github.com/dstepien>
 */

public class ProjectEuler_5 {
    public static void main(String[] args) {
        int result = 0;
        boolean divide = true;

        while (divide) {
            result++;
            divide = false;

            for (int i = 1; i <= 20; i++)
                if (result % i != 0)
                    divide = true;
        }

        System.out.println("The result is: " + result);
    }
}
