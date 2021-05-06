package duplicateElementArray;

public class DuplicateElements2 {

	public static void main(String[] args) {
		
		int arr[]= new int[] {1,2,3,2,2,1,4,8,6,3};	//our array has 3 times elements 
		System.out.println("Duplicate Elements in array are:");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.println(arr[j]);
				}
			}
		}
		
	}
}
