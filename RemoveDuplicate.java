package project6;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();
		 list.add("abc");
		 list.add("def");
		 list.add("ghi");
		 list.add("abc");
		 ArrayList<String> newlist = new ArrayList<>();
		 for(String s:list)
		 {
			 if(!newlist.contains( s)) {
				 newlist.add(s);
				 
			 }
		 }
		 for(String s1:newlist) {
			 System.out.println(s1);
		 }
	

	}

}
