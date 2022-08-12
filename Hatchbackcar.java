package project6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hatchbackcar {
	static int a=8;
	static int b=6;
	static int c=9;
	public static void hatchback() {
		Map<String,Integer> m=new HashMap<>();
		m.put("Glc",  a);
		m.put("E class", b);
		m.put("C class",c);
		System.out.println("enter 1-for Glc,2-for E class,3-for C class");
		Scanner scn=new Scanner(System.in);
		int i=scn.nextInt();
		switch(i) {
		case 1:
			System.out.println("your Glc car is booked");
			a=a-1;
			m.replace("Glc", a);
			System.out.println("currect present car is:"+m.get("Glc"));
			
			break;
		case 2:
			System.out.println(" SELECTED E class CAR");
			b=b-1;
			m.replace("E class ", b);
			System.out.println("currect present car is:"+m.get("E class "));
		case 3:
			System.out.println(" SELECTED GLD CAR");
			
			c=c-1;
			m.replace("C class", c);
			System.out.println("currect present car is:"+m.get("C class"));
			default:System.out.println("NOT FOUND CAR WHICH YOU WANT");
			
		

	}

}
}