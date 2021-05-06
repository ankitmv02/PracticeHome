package naveenAuto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
	List<String> namesList =	Collections.synchronizedList(new ArrayList<String>());
	namesList.add("Ankit");
	namesList.add("Suyash");
	namesList.add("Dhanraj");
	namesList.add("Yash");
	namesList.add("Sidharth");
	
	// for add,remove we dont need any synchroniostaion
	// but for fetching the value we will have to do explicit synchronization
	
	synchronized (namesList) {
		
		Iterator<String> itr =namesList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	//2. copyOnWriteArrayList Class
	System.out.println("----copyOnWriteArrayList----");
	CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<>();
	empList.add("Karan");
	empList.add("Akshay");
	empList.add("Palash");
	
	Iterator<String> itr =empList.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	
	
	}
}
