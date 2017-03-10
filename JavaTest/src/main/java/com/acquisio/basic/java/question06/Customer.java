package com.acquisio.basic.java.question06;

import java.util.EnumMap;

class Customer {
    //String type; // enterprise, professional or private
    
    private Types type;
    private double monthlyFee;

    public Customer(String type, double monthlyFee) {
        this.type = Types.valueOf(type);
        this.monthlyFee = monthlyFee;
    }

    public Types getType() {
        return type;
    }

    public void setType(String type) {
        this.type = Types.valueOf(type);
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
