package starpattern;

public class LeftTriangle {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {			//j<=i is must no need to mention any number
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
