package project6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Task171{
		public static void main(String[] args) {
				HashMap<String,Double> marks=new HashMap<>();
				
				marks.put("student1:", 90.00);
				marks.put( " student2:", 85.5);
				marks.put("  student3:",  75.0);
				
				for(Map.Entry m : marks.entrySet()){    
				    
		              double d=(double) m.getValue();
		              String s=(String) m.getKey();
		              if(d>=90) {
		              	System.out.println(s+"gold");
		              }
		              else if(d>=80&&d<=90) {
		              	System.out.println(s+"silver");
		              }
		              else if(d>=70&&d<=80) {
		              	System.out.println(s+"bronze");
		              


	}

}
		}
}
