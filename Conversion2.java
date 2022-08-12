package project6;
import java.util.*;

class Conversion2{

    public static void main (String[] args)
    {
        String[] st1 = {"Rahul", "Utkarsh",
                          "Shubham", "Neelam"};
 
        List<String> al =
            new ArrayList<String>(Arrays.asList( st1));
        System.out.println(al);
 
       
        al.add("Shashank");
        al.add("Nishant");
 
        System.out.println("ArrayList After adding " );
                            
        System.out.println(al);
    }

 
	}


