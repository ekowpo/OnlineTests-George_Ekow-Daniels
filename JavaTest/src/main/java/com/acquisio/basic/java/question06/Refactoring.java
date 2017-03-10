package com.acquisio.basic.java.question06;

/**
 * QUESTION 6: Refactoring
 * The method sumFeesWithMargin(List<Customer> customers)
 * do the sum of monthly fees for a list of customer with a
 * margin depending on the customer type.
 * <p>
 * Refactor this code so it will be easier to add a new type of
 * customer and make sure that we don't forget to add to montlhy fee
 * margin for that customer type.
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class Refactoring {
	
	 public static void main(String[] args) {
        Refactoring instance = new Refactoring();
        System.out.println(instance.sumFees());
    }
	 /**
	  * this method sums fees
	  * @return the fees summation.
	  */
    private double sumFees() {
        // TODO: Feel free to change any classes in this package.
        Customer c1 = new Customer("enterprise", 1000.0d);
        Customer c2 = new Customer("professional", 49.99d);
        Customer c3 = new Customer("Private", 9.99d);
        return FeeCalculator.sumFeesWithMargin(c1, c2, c3);
    }
}
