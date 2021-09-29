package week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListClassroom {

	public static void main(String[] args) {
		String arr[]= {"HCL","Ford","Wipro","Amazon","Cognizant"};
		List<String> list=new ArrayList<String>();
		list.addAll(Arrays.asList(arr));
		System.out.println("The list of elements are:"+list);
		Collections.sort(list);
		System.out.println("The sorted list is:"+list);
		Collections.reverse(list);
		System.out.println("The reversed list is:"+list);
		
	}

}
