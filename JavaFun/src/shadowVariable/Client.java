package shadowVariable;

public class Client {

	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle();
//		Car c = new Car();
//		Bike b = new Bike();
//		
//		System.out.println(v);
//		System.out.println(c);
//		System.out.println(b);

		Car car = new Car();
//		
		Bike vehicle = new Bike();
		Vehicle vBike = new Bike();
		Vehicle truck = new Truck();
		System.out.println(((Truck) truck).engineSound());
//		System.out.println(car.engineSound()); // null string not of reference type.  Ok :)
		
//pick object reference, pull the proper stunt
	}
}