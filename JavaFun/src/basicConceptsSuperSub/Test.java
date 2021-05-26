package basicConceptsSuperSub;

public class Test {

	public static void main(String[] args) {
		
		A objA = new A();
		objA.methodA(); //can only call method A
		
		B objB = new B();
		objB.methodA();  // extends Object A so can call method A
		objB.methodB();  // itself if Object B so can call method B
		
		// no problem with Superclass obj = new Subclass();
		int x = 10;
		A objA1 = new B();
		objA1.methodA();  // although object B can only access method A !
// objA1 has properties of A but object of B
// means can access properties of A available to B as a result of the extension

		objA1.methodB();
// A has 
		
		
//******** B objB2 = new A(); compiler error, not true
	}
}
