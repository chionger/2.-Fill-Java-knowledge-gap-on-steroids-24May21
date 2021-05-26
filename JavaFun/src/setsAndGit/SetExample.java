package setsAndGit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();  // if program as list, duplicates will not be removed.  

		//	Also not sorted.  Appear in same order as input.
		
//		List<String> set = new ArrayList<String>(); 

		set.add("Ravi");
		set.add("Angie");
		set.add("Ravi");
		set.add("Angie");
		set.add("Brian");
		set.add("Collin");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}