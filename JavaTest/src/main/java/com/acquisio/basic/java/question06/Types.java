package com.acquisio.basic.java.question06;

/**
 * Enum of Customer types
 * @author Ekow-Daniels
 *
 */
public enum Types {
	enterprise(1.10d), 
	professional(1.20d),
	Private(1.30d);
	
	
	private double value;
	
	/**
	 * Types Constructor
	 * @param value type corresponding value.
	 */
	private Types(double value)
	{
		this.value = value;
	}
	
	
	/**
	 * This method returns the value of type
	 * @return value
	 */
	public double getValue()
	{
		return value;
	}
	
	
}
