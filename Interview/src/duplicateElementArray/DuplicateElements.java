package duplicateElementArray;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,3,2,9};
		System.out.print("Duplicate Elements in Array :");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.print(array[j]+" ");
				}
			}
		}
	}
}
