package com.acquisio.basic.java.question06;

/**
 * Fees Calculator Class
 * @author Ekow-Daniels
 *
 */
public class FeeCalculator {
	
	/**
	 * SumFeesWithMargin Method
	 * @param customers Customer
	 * @return monthly fees
	 */
    static double sumFeesWithMargin(Customer ... customers) {
        double monthlyFees = 0.0d;
        for (Customer c : customers) {
        	monthlyFees += (c.getMonthlyFee() * c.getType().getValue());
       
        }

        return monthlyFees;
    }
}
