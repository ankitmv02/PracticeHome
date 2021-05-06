package mostasked;

import java.util.Scanner;

public class Counting_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		long n=sc.nextLong();
		int count=0;
		System.out.print("Total number in "+n+" =");
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.print(+count);
		
	}
}
