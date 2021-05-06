package faq;

public class Test {

	public static void main(String[] args) {
		
		final int a=10, b=20;
		do {
			System.out.println("Hello");
			//break;
		}
		while(a<b);
		//System.out.println("Hi");
	}
}


//Do while goes into infinite loop
//last print statement will not execute ....it is unreachable

//If break applied then Last print statement is valid