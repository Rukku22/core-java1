package project6;

import java.util.HashSet;

public class Converthashset {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<>();
		h.add("apple");
		h.add("banana");
		h.add("cherry");
		System.out.println(h);
		String [] arr=new String[h.size()];
		h.toArray(arr);
		for(String s:arr) {
			System.out.println(s);
		}
		
		

	}

}
