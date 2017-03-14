package com.acquisio.basic.java.question07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * QUESTION 07: Debugging
 * This method remove all even number from a list.
 * But the method is not working properly.
 * Find the error and fix it.
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class Debugging {

    public static void main(String[] args) {
        Debugging instance = new Debugging();
        System.out.println(instance.removeEvenNumbers(1, 2, 3, 4));
    }

    /**
     * This method removes Even numbers from a list of numbers
     * @param values a varargs of integers
     * @return a list of non-even numbers
     */
    private List<Integer> removeEvenNumbers(Integer ... values) {
        // TODO: Fix code here.

        List<Integer> integers = new ArrayList<>(Arrays.asList(values));
        List<Integer> removedIntegers = new ArrayList<>(Arrays.asList(values));
        for (Integer i : integers) {
            if (i.intValue() % 2 == 0) { // remove even numbers
            	removedIntegers.remove(i);
            }
        }

        return removedIntegers;
    }
}
