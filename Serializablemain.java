package project6;

import java.io.*;

public class Serializablemain {

	public static void main(String[] args) {
		Student s=new Student(12,"ruk","plmnr");
		Student t=new Student(13,"mus","bglr");
		try {
			FileOutputStream file=new FileOutputStream("serilize.text");
			ObjectOutputStream obj=new ObjectOutputStream(file);
			 obj.writeObject(s);
			 obj.writeObject(t);
			 obj.flush( );
			 obj.close();
			 System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
			 try {
			ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("serilize.text"));
			Student s1=(Student) obj1.readObject();
			System.out.println(s1.id+" "+s1.name+" "+s1.address);
			
			obj1.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
	

}
