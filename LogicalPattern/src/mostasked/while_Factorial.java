package mostasked;

import java.util.Scanner;

public class while_Factorial {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1, product=1;
		System.out.print("Enter the Value of n: ");
		int n=sc.nextInt();
		while(i<=n)
		{
			product=product*i;
			i++;
		}
		System.out.println("Factorial of "+n+" = "+product);
	}
}
