package weeklyAsssignment;

import java.util.ArrayList;

class Mobile{
	
	String brand;
	String model;
	int price;
	
	
	Mobile( String brand, String model, int price){
		
		this.brand = brand;
		this.model = model;
		this.price=  price;
		
	}
	
	
}

public class Assignment9_mobileStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Mobile> mob = new ArrayList<Mobile>();
		
		
	    System.out.println("Original Mobiles:");
		mob.add(new Mobile("Samsung","S23" ,70000));
		mob.add(new Mobile( "Apple" ,"iPhone15", 80000 ));
		mob.add(new Mobile("OnePlus","12" ,60000));
		mob.add(new Mobile ("Vivo","V30", 35000 ));
		mob.add(new Mobile("Realme", "GT" ,30000));
		
		for(Mobile M : mob) {
			System.out.println( M.brand +" "+ M.model +" "+ M.price);
			
		}
		
		System.out.println("\nAfter sorting by price:");
		mob.sort((b1,b2)-> Double.compare(b2.price,b1.price));
		for(Mobile M: mob) {
			
			System.out.println( M.brand +" "+ M.model +" "+ M.price);
		}
		
		System.out.println("\nAfter Removing Most Expensive Mobile:");
		Mobile max = mob.get(0);
		for(int i=1; i<mob.size(); i++ ) {
			if(mob.get(i).price> max.price) {
				max = mob.get(i);
				//break;
				
			}
			
			mob.remove(max);
		}
			for(Mobile M: mob) {
			System.out.println( M.brand +" "+ M.model +" "+ M.price);
			}
			
		String brand1 = "Vivo";
		for(Mobile M: mob) {
		if(M.brand.equalsIgnoreCase(brand1)) {
			System.out.println("\nbrand found:" + M.brand);
		}
		
		
			
	}
		
		System.out.println("\nAfter Price Update:");
		for(Mobile M: mob) {
			if(M.price==70000) {
				M.price = 68000;
			}
			System.out.println( M.brand +" "+ M.model +" "+ M.price);
		}
		}

}
