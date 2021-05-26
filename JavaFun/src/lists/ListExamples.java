package lists;

import java.util.ArrayList;
//import java.util.Collections;

public class ListExamples {

	Integer birds =3;  	//Integer is object
	int animals = 5;			// int is already processsed by method in Integr object
	Float	sharePriceFloat = 1.14332f;
	Boolean flag;   //if use Boolean result in null, if boolean result in false
	String name = "java training"; //must use double quotes
	Integer sum = 0;
	
	@SuppressWarnings("deprecation")
	Integer a = new Integer(43);
	
	@SuppressWarnings("deprecation")
	Integer b = new Integer("43");
	
	static int []num = new int[3];
	
	static ArrayList<Integer> al = new ArrayList<Integer>();
	
	public static void main(String[] args) {
//	name ="fullStack";  will get error if declare here because must have object instance before variables can be accessed
//	Alternative is to declare "static String name = "java traning " i.e.  available to class level
		ListExamples obj = new ListExamples();
		obj.name = "fullStack"; // now can access because accessing via object which has been instantiated
		System.out.println(obj.flag);
		obj.name = "new Name";
		obj.sum++;
		
		num[0] = 1;
		num[1] = 1;
		num[2] = 1;
//		num[3] = 1;
		
		al.add(13);
		al.add(133);
		al.add(1333);
		al.add(12);
		al.add(1);
		al.add(-9);
		al.add(-300);
		System.out.println(al);
//		Collections.sort(al);
		System.out.print(al);
//		Collections1 col1 = new Collections1();

		Collections1.mySort(al);
	}	
}
