package com.testing;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Testing {

	private static String[] nameList = new String[2];

	public static void main(String[] args) {

		/*
		 * ExecutorService executor = Executors.newFixedThreadPool(10); for (int i = 1;
		 * i <= 10; i++) { executor.execute(() -> { Test1.getInstance().printName(); });
		 * }
		 * 
		 * executor.shutdown();
		 */

		BigInteger b = BigInteger.ZERO;
		for (int i = 1; i <= 10; i++) {
			b = b.add(BigInteger.ONE);
		}
		System.out.println(b);

		b.intValue();
		/*
		 * Test1.getInstance().printName(); System.out.println("------------------");
		 * Test1.getInstance().getMap().forEach((key, value) -> System.out.println(key +
		 * ": " + value));
		 */

		/*
		 * nameList[0] = "Bhole"; nameList[1] = "Shiv";
		 * 
		 * Optional<String> o = Arrays.stream(nameList) .filter(name ->
		 * name.equals("Shbjmiv")) .findFirst();
		 * 
		 * if(o.isPresent()) { System.out.println("match : " + o.get()); }else {
		 * System.out.println("not match"); }
		 */
		
		System.out.println("-----------------------");
		
		Map<String, String[]> m = new HashMap<>();
		m.put("a", new String[]{"x1", "y1"});
		m.put("b", new String[]{"x2", "y2"});
		m.put("c", new String[]{"x3", "y3"});
		
		String[] s = m.get("a");
		//s = new String[2];
		System.out.println(s[0] + " : " + s[1]);
	}
}
