package project6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import project4.Arraylist;

public class Insertinglist {

	public static void main(String[] args) {
	      List<Character>  li = new ArrayList<>();  
	      Iterator<Character> itr=null;
	      li.add('b');
	      li.add('a');
	      li.add('c');
	      Collections.sort(li);
	      itr=li.listIterator();
	      while(itr.hasNext())
	    	  
	      System.out.println(itr.next());
	      


	}

}
