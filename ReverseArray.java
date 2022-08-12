package project6;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("a");
		a.add("p");
		a.add("p");
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);

	}

}
