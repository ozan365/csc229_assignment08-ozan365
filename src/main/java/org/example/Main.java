package org.example;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //generate primes 1 to 1000
        List<Integer> test = Primes.generatePrimes(1000);

        //get the list of numbers with the digit 3 from list "test"
        List<Integer> testThrees = Primes.getThrees(test);


        int sum = 0;

        //iterator for testThrees since it is a LinkedList
        Iterator<Integer> it = testThrees.iterator();

        //iterate over each element and add to sum
        while(it.hasNext()) {
            sum += it.next();
        }

        System.out.println(sum);
    }
}