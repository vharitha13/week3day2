package week3Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemovalCharacter {

	public static void main(String[] args) {
		String text = "PayPal india";
		char[] charArray = text.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for(int i=0;i<charArray.length;i++) {
			boolean add = charSet.add(charArray[i]);
			if(add==false) {
				dupCharSet.add(charArray[i]);
			}
		}
		System.out.println(charSet);
		System.out.println(dupCharSet);
		charSet.removeAll(dupCharSet);
		for (Character character : charSet) {
			if(character!=' ') {
				System.out.println(character);
			}
		}
	}
}
