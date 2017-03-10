package com.acquisio.basic.java.question06;

public enum Types {
	enterprise(1.10d), 
	professional(1.20d),
	Private(1.30d);
	
	private double value;
	
	private Types(double value)
	{
		this.value = value;
	}
	
	public double getValue()
	{
		return value;
	}
	
	
}
