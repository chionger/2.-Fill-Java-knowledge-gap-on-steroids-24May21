package designPattern.Singleton;

public class Logger {
	
	private static Logger logger; //accessible within the class
	
	private Logger() {    // making constructor private
						  // not accessible outside class
	}
	
	public static Logger getInstance() { 
	//to access method, needs to create class but class is private
	// and cannot be instantiated.  So make the method static
	// to allow it to be accessed without requirement for an instance. 
		
	// this would cause another problem where static reference 
	// a non static field, in order to resolve, declare logger as static as well
								
		if (logger == null) {		// if object do not exist
			logger = new Logger();  // create one
		}
		return logger;  //this is how the only instance of the class gets out
	}
}
