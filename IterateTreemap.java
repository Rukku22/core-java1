package project6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class IterateTreemap {

	private static final int Integer = 0;

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		t.put(101,"tiger");
		t.put(105, "loin");
		t.put(100, "fox");
Set set=t.entrySet();
Iterator it=set.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	
	 
}
}
