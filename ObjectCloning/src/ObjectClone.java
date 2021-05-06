import java.util.Scanner;

public class ObjectClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee Name:");
		String name=sc.nextLine();
		System.out.println("Enter the employee Id:");
		String id=sc.nextLine();
		
		Employee emp1=new Employee(name, id);
		System.out.println("Display from Original Object--"+emp1);
		System.out.println("Hashcode of Object--"+emp1.hashCode());
		
		Employee emp2=emp1.clone();		//Raises Clone not Supported
		System.out.println("Display from Cloned Object--"+emp2);
		System.out.println("Hashcode of Object--"+emp2.hashCode());
		sc.close();
	}
}
