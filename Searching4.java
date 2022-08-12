package project6;

import java.util.ArrayList;

import java.util.*;
public class Searching4 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("charan");
		names.add("cherry");
		names.add("ruk");
		names.add("husna");
		names.remove(2);
		names.set(0,"Ruksana");
	System.out.println(names);

		for(String s:names)
			if( s.contains("cherry")) {
				
			
			System.out.println(s);
		
		

	

	}

}
}
