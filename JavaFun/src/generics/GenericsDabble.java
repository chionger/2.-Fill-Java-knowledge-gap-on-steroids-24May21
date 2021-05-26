package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import lists.ListExamples;

public class GenericsDabble {

	public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			List<Integer> al1 = new ArrayList<Integer>();
			al.add(10);
			al.add(20);
			al.add(30);
//			al.add("Prank");
			Iterator i = al.iterator();
			while (i.hasNext()) {
				Integer ii = (Integer) i.next();
				System.out.println(ii);
			}
	}
}
