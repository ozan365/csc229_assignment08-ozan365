package org.example;

import java.util.List;
import java.util.LinkedList;

public class Primes {
    public static List<Integer> generatePrimes(int n) {
        //boolean to check whether number should be added to list
        boolean add = true;

        //linkedlist of primes
        List<Integer> Primes = new LinkedList<>();

        //always add 2 if n is greater than 2
        if (n >= 2)
            Primes.add(2);

        //go through all odd numbers 3 to n
        //cuts operation time in half since all even numbers greater than 2 are not prime
        for (int i = 3; i<= n; i+=2) {
            //check all numbers up to the square root of i
            for (int j = 3; j <= Math.sqrt(i); j++) {

                //if i is divisible by j, the number is not prime, add is changed to false and
                //the inner loop is terminated
                if (i % j == 0) {
                    add = false;
                    break;
                }
            }
            //if add is still true, add the number to Primes
            if (add) {
                Primes.add(i);
            }
            //reset add to true
            add = true;
        }
        //after loops terminate, return Primes
        return Primes;
    }

    private static boolean hasThree(int n) {
        //continues as long as n is greater than zero
        while(n > 0) {
            //if the remainder of dividing by 10 is 3, 3 is a digit and method returns true
            if (n % 10 == 3)
                return true;
            //otherwise, truncate the number by one digit and repeat
            n /= 10;
        }
        //if 3 is not detected, return false
        return false;
    }

    public static List<Integer> getThrees(List<Integer> list) {

        //linkedlist of primes with three
        List<Integer> threePrimes = new LinkedList<>();

        //iterate over parameter list using foreach loop (faster than normal for loop)
        for(int n: list) {
            //if a three is detected add element from parameter list into threePrimes
            if (hasThree(n))
                threePrimes.add(n);
        }
        //return the linkedlist
        return threePrimes;
    }
}
