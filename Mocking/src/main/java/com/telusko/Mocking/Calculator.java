package com.telusko.Mocking;

public class Calculator {
	
	CalculatorService cs;
	
	Calculator(CalculatorService cs){
		this.cs=cs;
	}
	
	public int perform(int i, int j) {	//(i+j)*i
		return cs.add(i, j)*i;
	}
}
