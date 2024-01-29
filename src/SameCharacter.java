import java.util.ArrayList;
import java.util.Arrays;

public class SameCharacter {
	/*
	 * String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame",
	 * "aepm" };
	 * 
	 * output: [epam, pame, aepm] contains same character [java, ajav] contains same
	 * character [abcd, dcba] contains same character
	 * 
	 */

	public static ArrayList<String> sameCharacter(String[] s) {
		ArrayList<String> al = new ArrayList<>();

		for (int i = 0; i < s.length; i++) {
			char[] a = s[i].toCharArray();
			Arrays.sort(a);
			al.add(s[i]);
			for (int j = i + 1; j < s.length - 1; j++) {
				char[] b = s[j].toCharArray();
				Arrays.sort(b);
				if (String.valueOf(a).equals(String.valueOf(b))) {
					al.add(s[j]);
				}
			}
		}
		return al;
	}

	public static void main(String[] args) {
		String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
		ArrayList<String> sameCharacter = sameCharacter(arr);
		sameCharacter.stream().forEach(System.out::println);
	}
}
