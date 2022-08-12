package project6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Studentmarks {
	
	public static void main(String[] args) {
		HashMap<String,Double> marks=new HashMap<>();
		
		marks.put("selva:", 75.6);
		marks.put( "abi:", 89.5);
		marks.put("ram:", 40.0);
		
		for(Map.Entry m : marks.entrySet()){    
		    
              double d=(double) m.getValue();
              String s=(String) m.getKey();
              if(d>60) {
            	  
		System.out.println(s+"pass");
	}
	else if(d <60){
		
			System.out.println(s+"fail");
		}
		
	
	}
	
		
	}
 		
	}

	

		
     

  
		
		
		
		
	
	


