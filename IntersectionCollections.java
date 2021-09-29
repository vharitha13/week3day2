package week3Day2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionCollections {

	public static void main(String[] args) {
		int arr[]= {3,2,11,4,6,7};
		int arr1[]= {1,2,8,4,9,7};
		List<Integer> numList=new ArrayList<Integer>();
		List<Integer> numList1=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			numList.add(arr[i]);
		}
		for(int j=0;j<arr1.length;j++) {
			numList1.add(arr1[j]);
		}
		numList.retainAll(numList1);
		System.out.println(numList);
	}

}
