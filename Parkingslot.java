package project6;

import java.util.Scanner;

public class Parkingslot {
	int slot=15;
	public void bike() {
		  
		 
			Scanner scn=new Scanner(System.in);
			for(int i=1;i<=15;i++) {
			System.out.println("enter a single slot number ");
 			int x=scn.nextInt();
			switch(x) {
			case 1:System.out.println("bike slot is booked");
			slot--;
			
			System.out.println("current slots:"+slot);
			System.out.println("generate a receipt");
			System.out.println("thank you for booking");
			
			int e=0;
			if(slot==0) {
				System.out.println("slot is empty");
			}
			else {
				System.out.println(" slot is booked");
			
			}
			      break;
			case 2:
				System.out.println("car slot is booked");
				slot--;
				
				System.out.println("current slots:"+slot);
				System.out.println("generate a receipt");
				System.out.println("thank you for booking");
				
				int e1=0;
				if(slot==0) {
					System.out.println("slot is empty");
				}
				else {
					System.out.println(" slot is booked");
				
				}
				
			default:System.out.println("");
		
			}
		}
		
	}

public static void main(String[] args) {
	Parkingslot p=new Parkingslot();
	p.bike();
	

	System.out.println(p);	

	}

}
