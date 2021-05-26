package shadowVariable;

public abstract class Vehicle {

	int noOfWheels = 4;
	
	public String stunt() {
		return "Vehicle stunt";
	}
	
	@Override 
	public String toString() {
		return " vars " + noOfWheels + " " + getClass().getName();
	}
	//Exact behaviour in sub-class = overriding
	//Exact variable in sub-class = shadowing

//	String engineSound() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}