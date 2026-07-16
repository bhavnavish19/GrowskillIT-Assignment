package weeklyAsssignment;

class Vehicle{
	
	String brand;
	int speed;
	String reversed;
	String equalTo;
	String replace;
	

void run() {
	System.out.println("Question 2\n ");
	System.out.println("Vehicle is running");
}

void StringChecks(String reversed, String equalTo,String replace) {
	
 
	
}

final void engineType() { // final method cannot able to overridden in subclass car
	System.out.println("Question 4\n");
	System.out.println("Engine Type : Standard engine\n");
}
}
class Car extends Vehicle{
	
	String fuelType;
	static String company; // static variable
	
	
	Car(String brand , int speed , String fuelType){
		super();
		this.brand = brand;
		this.speed = speed;
		this.fuelType = fuelType;
		
	
			
		}
	
	void Display() {
		System.out.println("Question 1\n");
		System.out.println("Brand : " + brand );
		System.out.println("Speed : " + speed );
		System.out.println("FuelType : " + fuelType +"\n" );
	}
	
	void run() { // method overriding
		super.run();
		System.out.println("Car is running smoothly\n");
	}
	
	static void displayCompany(String company) { // Static method 
		System.out.println("Question 3\n");
		System.out.println("Company : " + company+"\n");
		
	}
	//final void engineType() { // cannot override fibal method of parent class "Vehicle
		

	
}

public class Assignment7_VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brand = "Hyundai";
		Car obj = new Car("Hyndai", 120 , "Petrol");
		obj.Display();
		obj.run();
		Car.displayCompany(" AutoWorld Ltd");
		Vehicle vehicle = new Vehicle();
		vehicle.engineType();
		
		String reversed = new StringBuilder(brand).reverse().toString();
		String replace = brand.replaceAll("['a','u', 'i']", "*");
		Boolean equalTo = brand.equals("Hyundai");
		
		System.out.println("Question 5\n");
		System.out.println("Reversed : " + reversed);
		System.out.println("Replaced : " + replace);
		System.out.println("Equal Hyundai : " + equalTo);
		
	}

}
