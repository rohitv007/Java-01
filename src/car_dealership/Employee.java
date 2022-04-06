package car_dealership;

public class Employee {
	public void handleCustomer(Customer cust, Vehicle vehicle, boolean finance) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println(cust + "has insufficient funds for " + vehicle);
		}
	}
	
	public void runCreditHistory(Customer cust, double loadAmount) {
		System.out.println("Ran credit history for customer " + cust);
		System.out.println("Bank has approved the customer for purchase");
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println(cust + " has purchased " + vehicle + " for price " + vehicle.getPrice());
	}
}
