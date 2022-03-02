package forth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectTest {

	public static void main(String[] args) {
		Map <String,String>map= new HashMap<String,String>();
		map.put("castello", "1234");
		map.put("asdf", "1111");
		map.put("lang", "1234");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		//Iterator<String> it = map.keySet().iterator();
		//
		
		while(it.hasNext()) {
			String key= it.next();
			String val = (String) map.get(key); 
			System.out.println( "ID :" +key + "\t|\tPW :" + val);
		}
	}

}
