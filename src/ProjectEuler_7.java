/**
 * Project Euler - problem 7
 * <p/>
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * <p/>
 * What is the 10 001st prime number?
 *
 * @author Dawid Stępień <https://github.com/dstepien>
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ProjectEuler_7 {
    public static void main(String[] args) {
        int nPrimeNumber = 10001;
        int i = 2;
        boolean noPrimeNumber;

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>(nPrimeNumber);

        primeNumbers.add(i);

        while (primeNumbers.size() < nPrimeNumber) {
            i++;
            noPrimeNumber = false;

            Iterator iterator = primeNumbers.iterator();

            while (!noPrimeNumber && iterator.hasNext()) {
                if (i % (Integer) iterator.next() == 0)
                    noPrimeNumber = true;
            }

            if (!noPrimeNumber)
                primeNumbers.add(i);
        }

        System.out.println("The 10 001st prime number is: " + (primeNumbers.get(primeNumbers.size() - 1)));
    }
}
