package project6;

import java.util.*;
import java.util.Scanner;


public class Task191 {
	
	public void array() {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a size of array");
		int size=scn.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[size];
	for(int i=0;i<size;i++) {
		System.out.println("enter array index="+i);
		arr[i]=scn.nextInt();
		
	}
		for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		int i,j=0;
	for( i=0;i<size-1;i++) {
		if(arr[i]!=arr[i+1]) {
			arr1[j++]=arr[i];
		}
		arr1[j++]=arr[size-1];
		for( i=0;i<j;i++) {
			arr[i]=arr1[i];
			System.out.println(arr[i]);
						
			}
		
		}
	}
}
	
	


