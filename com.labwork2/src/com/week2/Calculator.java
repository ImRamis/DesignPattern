package com.week2;

public class Calculator implements ICalculator {

	@Override
	public double add(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public double sub(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public double div(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	@Override
	public double mul(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}
	
}
