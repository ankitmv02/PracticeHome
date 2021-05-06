package com.telusko.ExceptionHandling;

public class Test {

	public static void check(int marks) throws MyException{			//We can't make static ref for non static
		if(marks>100) {
			throw new MyException("Invalid Marks");
		}
		else
			System.out.println("You have Valid marks");
	}
	public static void main(String[] args) {
		try {
			check(99);
		}
		catch(Exception msg) {
			System.out.println("Exception Occured:"+msg);
		}
		System.out.println("Main---End");
		
	}
}
