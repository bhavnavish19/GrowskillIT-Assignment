package weeklyAsssignment;

//Abstract Class
abstract class Payment{ 
	int amount;
	
	// Abstract Method with no body
	abstract void makePayment();
	
	// Normal method
	void paymentDetails() {
		System.out.println("Payment Amount :" + amount );
	}
}

class CreditCardPayment extends Payment{

	@Override
	void makePayment() {
	
		System.out.println("Paid " + amount + " using credit card ending with 3221" + "\n");
		
		
		
	}	
	
}
class UpiPayment extends Payment{

	@Override
	void makePayment() {
		System.out.println("Paid " + amount + " using UPI ID: user@upi");
		
	}
	
}
public class Assignment8_EcommercePaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment p = new CreditCardPayment(); // create object using dynamic polymorphism - it means a parent class holds child class object 
		p.amount = 5000;
		p.paymentDetails();
		p.makePayment();
		
		p = new UpiPayment();
		p.amount = 1500;
		p.paymentDetails();
		p.makePayment();
		
	

	}

}
