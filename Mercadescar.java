package project6;

import java.util.Scanner;

public class Mercadescar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			
		
		System.out.println("enter your choice car:1-SVU,2-Hatchback");
		int j=scn.nextInt();
		switch(j) {
		case 1:
			System.out.println("select SVU car");
			Svucar.suv();
			break;
		case 2:
			System.out.println("select hatchback car");
			Hatchbackcar.hatchback();
			default:System.out.println("enter in between 1 to 5");
		}

	}

	}
}
