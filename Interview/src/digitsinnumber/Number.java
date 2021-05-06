package digitsinnumber;

public class Number {

	public static void main(String[] args) {
		int n=1515,count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("No of Digits:"+count);
	}
}
