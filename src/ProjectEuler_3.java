/**
 * Project Euler - problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Dawid Stępień <https://github.com/dstepien>
 */
public class ProjectEuler_3 {
    public static void main(String[] args)
    {
        long number = 600851475143L;
        int result = 0;
        int divisor = 2;

        while(number > 1)
        {
            divisor++;

            if(number % divisor == 0)
            {
                number /= divisor;

                if(result < divisor)
                {
                    result = divisor;
                }

                divisor = 2;
            }
        }

        System.out.println(result);
    }
}
