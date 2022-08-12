package project6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Hashmapserilize {

	public static void main(String[] args) {
 HashMap<Integer,String> h=new HashMap<>();
  h.put(12, "Fastfood");
 h.put(34, "Fruit");
 h.put(67, "Seafood");
  h.put(89, "Vegetables");
  h.put(67, "Protein-Rich");
  

	
	try {
		FileOutputStream file=new FileOutputStream("C:\\Users\\D1\\Desktop\\ruksana\\newHashMap.text");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		System.out.println("Success");
		file.close();
		obj.close();
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}

}
}
