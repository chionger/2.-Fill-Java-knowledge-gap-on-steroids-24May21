package setsAndGit;

import java.util.LinkedList;
import java.util.List;

public class MySortLinked {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();

		list.add(6000);
		list.add(60);
		list.add(160);
		list.add(26);
		list.add(6456);
		list.add(346);
		list.add(64);
		list.add(6);

		List listA = new LinkedList();
		listA.add(6000);
		listA.add("Apple");
		listA.add(160);
		listA.add("Orange !@#$%^&*");
		
		
		
		Integer swapInteger =0;
		Integer swapFlag = 1;
		//		System.out.println(list);

		while (swapFlag == 1) {
			Integer swap =0;
			for(int i=0; i<list.size()-1; i++) {// note the use of < because of 0 indexing
				if (list.get(i)> list.get(i+1)) {
					swap=1;
					swapInteger = list.get(i);
					//				list.get(i) = list.get(i+1); // not this way
					list.set(i, list.get(i+1));
					list.set(i+1, swapInteger);
					System.out.println(list);
				}
			}
			swapFlag=swap;
		}

	}


}
