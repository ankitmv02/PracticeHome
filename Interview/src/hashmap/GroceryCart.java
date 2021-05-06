package hashmap;

import java.util.HashMap;
import java.util.Map;

public class GroceryCart {

	public static void main(String[] args) {
		
		Map<Integer, String> cart=new HashMap<Integer, String>();
		cart.put(1, "Item Name");
		cart.put(2, "Price");
		cart.put(3, "Quantity");
		
		for(Map.Entry m : cart.entrySet()) {
			System.out.println(m.getValue() +" " + m.getKey());
		}

	}

}
