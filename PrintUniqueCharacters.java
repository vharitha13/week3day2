package week3Day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		String str= "amma123";
		char[] charArray = str.toCharArray();
		Set<Character> setChar=new LinkedHashSet<Character>();
		for(int i=0;i<charArray.length;i++) {
			setChar.add(charArray[i]);
		}
			System.out.println(setChar);
		}
}
