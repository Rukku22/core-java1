package project6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizeArray {
	

		public static void main(String[] args) {
			List<String>list=new ArrayList<>();
			 list.add("practice");
		        list.add("code");
		        list.add("quiz");
		        List<String>list1=Collections.synchronizedList(list);
		        System.out.println(list1);
		        	Iterator itr= list1.iterator();
		        	while(itr.hasNext());
		        	System.out.println(itr.next());
		        	
		        }
		        
			

		}


