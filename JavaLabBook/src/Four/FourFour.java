package Four;

import java.util.ArrayList;
import java.util.Collections;

public class FourFour {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Samsung");
		list.add("Nokia");
		list.add("RealMe");
		list.add("OnePlus");
		list.add("Apple");
		list.add("MI");
		System.out.println(list);
		
		
		Collections.sort(list);
		System.out.println("Sorted list is : "+list);
		
		Collections.sort(list, new DscComparator());
//		Collections.sort(list,Collections.reverseOrder());	
		System.out.println("Descending Sorted list is : "+list);
	}

}
