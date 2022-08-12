package project6;

public class Shopping {
	public void HometownShop(String name) {
		System.out.println("bought new pair of jeans");
		
	}
	public void HometownShop( ) {
		System.out.println("went another shop for new varient but not found ");
		
		
	}
	public void HometownShop(String name1,String name2) {
		System.out.println("so again return to hometown shop to buy jeans but not found");
	}
	
	

	public static void main(String[] args) {
		Shopping s=new Shopping();
		s.HometownShop("Allen solly");
		s.HometownShop();
		s.HometownShop("near home","Allen solly");
		
	}

}
