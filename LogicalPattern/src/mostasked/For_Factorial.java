package mostasked;

import java.util.Scanner;

public class For_Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f=1;
		System.out.print("Enter the value of n:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of "+n+" = "+f);
	}
}
