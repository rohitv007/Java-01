package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Customer cust1 = new Customer("Rohit", "123 XYZ Street", 15000);
		
		Vehicle vehicle = new Vehicle("Skoda", "Kushaq", 14000);
		
		cust1.purchaseCar(emp, vehicle, false); 
	}

}
