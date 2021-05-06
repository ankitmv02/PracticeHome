package mostasked;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to Check it is Prime or Not:");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println("It is a Prime Number");
		else
			System.out.println("It is not a Prime Number");
	}
}
