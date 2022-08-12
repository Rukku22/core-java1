package project6;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Convertlinked {

	public static void main(String[] args) {
		 		LinkedList<String> l=new LinkedList<>();
				l.add("abc");
				l.add("chf");
				l.add("bhk");
				l.add("bhg");
				List<String> a=new ArrayList<String>(l);
				System.out.println("print arraylist elements:");
				for(Object s:a) {
					System.out.println(s);
				}

			}

		


	}


