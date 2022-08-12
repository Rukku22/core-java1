package project6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Syncronization1 {

	public static void main(String[] args) throws Exception{
		try {
			Map<Integer,String> m1=new HashMap<>();
			m1.put( 1, "avs");
			m1.put(2, "bjhg");
			m1.put(3, "hjeg");
			m1.put(0, "hjh");
			System.out.println(m1);
			Map<Integer,String>m2=Collections.synchronizedMap(m1);
			System.out.println("synchronize map:"+m2);
			
			
		}
        catch (IllegalArgumentException e) {
        	System.out.println("thrown excepiont:"+e);

			
		}
		

	}

}
