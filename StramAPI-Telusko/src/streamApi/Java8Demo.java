package streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8Demo {
	public static void main(String[] args) {
		
		
		
		//Normal For
//		for(int i=0;i<6;i++) {
//			System.out.println(values.get(i));
//		}
		
		//Iterator method
//		Iterator<Integer> itr=values.iterator();
//		while(itr.hasNext()) {
//			 System.out.println(itr.next());
//		}
		
//		//Enhanced for loop
//		for(int i:values) {
//			System.out.println(i);
//		}
		
		//This was all External Implementation..Now we will see internal implementation of interator
		List<Integer> values= Arrays.asList(1,2,3,4,5,6);
//		values.forEach(i->System.out.println(i));
		
		
		//Lambda Expression in JDK8
//		System.out.println("This is Call by Method Feature JAVA 8");
//		values.forEach(System.out::println);
		
		//Converting normal List in Stream
		values.stream().forEach(System.out::println);
	}

}
