package project6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		Map m=new HashMap();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a size");
		int a=scn.nextInt();
		String[] state=new String[a];
        String[] capital=new String[a];
        for(int i=0;i<=a;i++) {
        	System.out.println("enter capital: ");
        	capital[i]=scn.next();
        	System.out.println("enter state:");
        	state[i]=scn.next();
        	m.put(capital[i],state[i]);
        	Iterator itr=m.entrySet().iterator(); 
        	while(itr.hasNext())
        	
        	System.out.println(itr.next());
        	
        }
		
		

	}

}
