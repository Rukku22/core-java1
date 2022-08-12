package project6;
import java.util.*;
import java.util.Map.Entry;

public class MapCountrys {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		
		int i=1;
		m.put("india","Delhi");
		m.put("china","Beijing");
		m.put("azerbaijan","Baku");
		for(String country:m.keySet())
			System.out.println("countrys="+country);
		for (Map.Entry<String,String> entry : m.entrySet()) 
			System.out.println("entry set="+entry);
		Iterator<Map.Entry<String,String>> itr = m.entrySet().iterator();
		 
		while (itr.hasNext()) {
		    System.out.println(  itr.next());
		}

		
		
		

	}

}
