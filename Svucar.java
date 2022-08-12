package project6;

import java.util.*;

public class Svucar {
	static int a=8;
	static int b=6;
	static int c=9;
		public static void suv() {
			Map<String,Integer> m=new HashMap<>();
			m.put("GLC",  a);
			m.put("GLE", b);
			m.put("GLD",c);
			System.out.println("enter 1-for GLC,2-for GLE,3-for GLD");
			Scanner scn=new Scanner(System.in);
			int i=scn.nextInt();
			switch(i) {
			case 1:
				System.out.println("your GLC car is booked");
				a=a-1;
				m.replace("GLC", a);
				System.out.println("currect present car is:"+m.get("GLC"));
				
				break;
			case 2:
				System.out.println(" SELECTED GLE CAR");
				b=b-1;
				m.replace("GLE", b);
				System.out.println("currect present car is:"+m.get("GLE"));
			case 3:
				System.out.println(" SELECTED GLD CAR");
				
				c=c-1;
				m.replace("GLD", c);
				System.out.println("currect present car is:"+m.get("GLD"));
				default:System.out.println("NOT FOUND CAR WHICH YOU WANT");
				
				
		
		

	}

}}
