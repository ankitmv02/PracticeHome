package hashmapCart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapImpl {

	public static void main(String[] args) {
		
		
		GroceryCart gc1=new GroceryCart("CornFlakes", 300, 2);
		GroceryCart gc2=new GroceryCart("Soap", 50, 4);
		GroceryCart gc3=new GroceryCart("Hide&Seek", 30, 3);
		GroceryCart gc4=new GroceryCart("Toast", 35, 3);
		
		HashMap<Integer, GroceryCart> hm=new HashMap<Integer, GroceryCart>();
		hm.put(1, gc1);
		hm.put(2, gc2);
		hm.put(3, gc3);
		hm.put(4, gc4);
		
		Iterator itr=hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry record=(Map.Entry) itr.next();
			GroceryCart groc=(GroceryCart)record.getValue();
				System.out.println(record.getKey()+" "+groc.getItemName()
				+" "+groc.getPrice()+" "+groc.getQuantity());
		}
	}
}
