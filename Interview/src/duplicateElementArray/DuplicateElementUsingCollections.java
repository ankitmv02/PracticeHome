package duplicateElementArray;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementUsingCollections {

	public static void main(String[] args) {
		
		int arr[]= new int[] {1,2,3,2,1,4,8,6,3};
		Set<Integer> set=new HashSet<Integer>();
		System.out.println("Duplicate Elements are:");
		for(int i=0;i<arr.length;i++) {
			if(set.add(arr[i])==false)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
