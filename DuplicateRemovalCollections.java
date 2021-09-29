package week3Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemovalCollections {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> newSet = new LinkedHashSet<String>();
		Set<String> dupNewSet = new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			boolean add = newSet.add(split[i]);
			if (add == false) {
				dupNewSet.add(split[i]);
			}
		}
		for (String string : newSet) {
			System.out.println(string);
		}
		System.out.println(dupNewSet);
	}
}
