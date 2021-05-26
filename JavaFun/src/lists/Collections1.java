package lists;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {

	static public ArrayList<Integer> mySort(ArrayList<Integer> templist){
		
		Collections.sort(templist);
		return templist;
	}
}
// utility class
// usually static so that there is no requirement to instantiate the object before using the methods
// no variables
