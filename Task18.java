package project6;

import java.util.Arrays;

public class Task18 {

	public static void main(String[] args) {
		String[] arr= {"a","c","b","d","f"};
          Arrays.sort(arr);
//          System.out.println(arr);
         int c=arr.length;
         String[] a=new String[c];

         for(int i=0;i<c;i++) {
        	 
        	 if(i<(c/2)+1) {
        		 a[i]=arr[i].toUpperCase();
        	 }
        	 else {
        		 a[i]=arr[i].toLowerCase();
        	 }		 
         }
         for(int i=0;i<c;i++) {
        	 System.out.print(a[i]+" ");
         }
	}
}



