package arraylistDuplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Ankit");
		al.add("Axay");
		al.add("Ankit");
		al.add("Aase");
		al.add("Karan");
		al.add("Aase");
		System.out.println("ArrayList with Repeated Elements:"+al);
		//System.out.println(al.toString());
		
		Set<String> s=new LinkedHashSet<>(al);
		System.out.println("ArrayList without Repeated elements:"+s);
	}
}
