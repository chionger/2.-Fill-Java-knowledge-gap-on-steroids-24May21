package designPattern.Singleton;

public class LoggerTest {

	public static void main(String[] args) {
// static applies to methods and attributes, not class
		
		System.out.println("--------singleton-----------------");
//		Logger obj1 = new Logger(); instantiation of object not required
		Logger obj1 = Logger.getInstance();  //class is public so still accessible
		Logger obj2 = Logger.getInstance();  //except that instantiation is controlled
		
// how to know if the objects are the same ?
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println("--------non - singleton-----------------");
		LoggerTest obj3 = new LoggerTest();
		LoggerTest obj4 = new LoggerTest();

		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}
}