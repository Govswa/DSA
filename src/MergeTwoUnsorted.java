import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class MergeTwoUnsorted {

	// write a program to merge two unsorted arrays into single sorted array without
	// duplicates using streams?

	public static List<Integer> mergeTwoArray(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		
		IntStream aStream = Arrays.stream(a);
		IntStream bStream = Arrays.stream(b);

		List<Integer> aList = aStream.boxed().collect(toList());
		List<Integer> bList = bStream.boxed().collect(toList());

		aList.addAll(bList);

		return aList.stream().distinct().sorted().collect(toList());
	}

	public static void main(String[] args) {
		int[] a = { 9, 3, 1, 10 };
		int[] b = { 9, 8, 20, 1, 9 };

		List<Integer> mergeTwoArray = mergeTwoArray(a, b);
		mergeTwoArray.forEach(el -> System.out.print(el + " "));

	}
}
