package com.testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test2 {

	public void print(String[] nameList, Test1 t1, int id, List<String> addressList) {
		Arrays.stream(nameList).forEach(name -> {
			//addressList.stream().forEach(address -> printName(name, t1, id, address));
			System.out.println(name);
		});
		/*
		 * for (String name : nameList) { for (String address : addressList) {
		 * printName(name, t1, id, address); } }
		 */

		System.out.println("----------------");
		/*
		 * Arrays.stream(nameList).forEach((name) -> { for(String address : addressList)
		 * { printName(name, t1, id, address); }
		 * //addressList.stream().forEach((address) -> printName(name, t1, id)); });
		 * 
		 * 
		 */
		
		Map<String, Integer> map = new HashMap<>();
		Iterator<Entry<String, Integer>> entrySet = map.entrySet().iterator();
		
		
	}

	private static void printName(String name, Test1 t, int id, String address) {
		System.out.println("Id : " + id + ", name : " + name + ", address : " + address);
		/*
		 * IntStream.rangeClosed(1, id).forEach(i -> { t.getMap().put("" + i, i + "");
		 * });
		 */
	}
}
