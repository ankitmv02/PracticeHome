
public class Employee implements Cloneable {		//Cloneable needs to implement

	String name,id;
	Employee(String name,String id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	public Employee clone() throws CloneNotSupportedException
	{
		return (Employee)super.clone();		//Clone Not Supported Exception
	}
}
