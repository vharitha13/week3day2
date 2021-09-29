package week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int data[]= {3,2,11,4,6,7};
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<data.length;i++) {
			list1.add(data[i]);
		}
		Collections.sort(list1);
		System.out.println("The sorted list of numbers:"+list1);
		Integer secondElement = list1.get(4);
		System.out.println("The 2nd element from the last is:"+secondElement);
	}

}
