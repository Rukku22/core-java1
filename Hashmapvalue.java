package project6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Hashmapvalue {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<>();
		m.put(211,"a");
		m.put(311,"p");
		m.put(211,"b");
		System.out.println(m);
		TreeMap <Integer,String> t=new TreeMap<>(m);
		Iterator itr=t.keySet().iterator();
		while(itr.hasNext()) {
			int key=(int)itr.next();
			System.out.println(" roll no="+key+  "   names:"+m.get(key));
	

	}

	}}