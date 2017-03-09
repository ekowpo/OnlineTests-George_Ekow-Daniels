package com.acquisio.basic.java.question04;

/**
 * QUESTION 04: StackOverflow
 * This program crashes after throwing StackOverflowError exception:
 * Fix the factorial method.
 *
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class IssueResolving {
    public static void main(String[] args) {
        IssueResolving instance = new IssueResolving();
        System.out.println(instance.factorial(7));
    }

    /**
     * This method calculates the factorial of a given number
     * @param n number 
     * @return  'N' factorial
     */
    private int factorial(int n) {
        // TODO: Fix code here.
    	int result = 0;
    	if(n==1)
    		return 1;
        result = factorial(n - 1) * n;
        return result;
    }

}
