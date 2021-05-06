package arrayList;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ankit");
		al.add("Ashish");
		al.add("Ashwin");
		al.add("Ankit");
		al.add("Sarry");
		al.add("07");
		al.add("Nilesh");
		al.add("Shree");
		al.add("Karan");
		al.add("Palash");
		al.add("Krish");
		al.add("Akshay");
		al.add("Mahendra");
		al.add("Siya");
		for(String i:al)
		{
			System.out.print(i+" ");
			al.add("Popo");
		}
//		System.out.println();
//		System.out.println("AL elements:"+al);
//		System.out.println("Size is:"+al.size());
//		
//		al.remove("07");
//		al.remove("Nilesh");
//		
//		System.out.println("AL elements:"+al);
//		System.out.println("New Size:"+al.size());
		
	}
}
