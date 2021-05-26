package shadowVariable;

public class Bike extends Vehicle{

	int noOfWheels = 2;
	
	String engineSound() {
		return "Tuk tuk";
	}
	
	public String villy() {
		return ("Bike stunt");
	}
	
	@Override
	public String stunt() {
		return super.stunt();
	}
	
	@Override 
	public String toString() {
		return " vars " + this.noOfWheels + " " + getClass().getName();
	}
	//use of this to qualify looking for variable from this object
}