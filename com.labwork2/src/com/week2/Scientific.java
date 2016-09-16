package com.week2;

public class Scientific extends Calculator implements IScientific{

	@Override
	public double remainder(double num1, double num2) {
		return (num1 / num2);
	}

	@Override
	public double square(double num) {
		return (num * num);
	}
	
}
