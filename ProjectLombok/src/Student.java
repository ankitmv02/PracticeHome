import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public @Data class Student {

	private int age;
	private String name;
	private String address;
	
}
