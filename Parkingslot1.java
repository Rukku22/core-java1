package project6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Parkingslot1 {

	public void parking() {
		HashMap bike=new HashMap();
		HashMap car=new HashMap();
		ArrayList l1=new ArrayList();
		ArrayList l2=new ArrayList();
		for(int i=1;i<=15;i++) {
			bike.put(i,  "basement-1");
		}
		for(int j=1;j<=15;j++) {
			car.put(j,"basement-2");
		}
		while(true) {
			Scanner s=new Scanner(System.in);
			System.out.println("select bike for 1 and car for 2");
			int k=s.nextInt();
			if(k==1) {
				System.out.println("enter ur bike number");
				int l=s.nextInt();
				if(l1.contains(l)) {
					System.out.println("slot is booked");
				}
				else {
					l1.add(l);
					System.out.println("available slots are in basement 1");
					Set set=bike.entrySet();
					Iterator it=set.iterator();
					while(it.hasNext()) {
						Map.Entry e=(Entry) it.next();
						System.out.println(e.getKey());
					}
					System.out.println("enter slot number");
					int slotno=s.nextInt();
					if(bike.containsKey(slotno)) {
						System.out.println("slot is booked");
						System.out.println("ur slot number:"+slotno);
						bike.remove(slotno);
					}
					else {
						System.out.println("please enter valid slot number from lis");
						
						
					}
					
				}
			}
			else if(k==2) {
				System.out.println("enter ur CAR number");
				int c=s.nextInt();
				if(l1.contains(c)) {
					System.out.println("slot is booked");
				}
				else {
					l1.add(c);
					System.out.println("available slots are in basement 1");
					//Set set=bike.entrySet();
					Iterator it1= car.entrySet().iterator();
					while(it1.hasNext()) {
						Map.Entry e1=(Entry) it1.next();
						System.out.println(e1.getKey());
					}
					System.out.println("enter slot number");
					int slotno=s.nextInt();
					if(car.containsKey(slotno)) {
						System.out.println("slot is booked");
						System.out.println("ur slot number:"+slotno);
						bike.remove(slotno);
					}
					else {
						System.out.println("please enter valid slot number from lis");
						
						
			
			
		}

	}

			}
		}
	}
}
