package project6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Itaration4 {

	public static void main(String[] args) {
	ArrayList<Integer>arr=new ArrayList<Integer>()	;
	arr.add(5);
	arr.add(8);
	arr.add(9);
    Collections.sort(arr, Collections.reverseOrder());

	System.out.println(arr);
	ListIterator<Integer> list=arr.listIterator();
	while(list.hasNext())
		System.out.println(list.next());
    

	
	
	

	}

}
