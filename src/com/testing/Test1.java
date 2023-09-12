package com.testing;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Test1 {

	private volatile static Test1 t = null;
	private Map<String, String> map = new Hashtable<>();
	private String[] nameList = new String[2];
	private List<String> addressList = Arrays.asList("Banaras Shiv", "Allahabad", "Kanpur");

	private Test1() {
		System.out.println("Called..");
		nameList[0] = "Bhole";
		nameList[1] = "Shiv";
	}

	public synchronized void printName() {
		new Test2().print(nameList, this, 10, addressList);
	}

	public static Test1 getInstance() {
		if (t == null) {
			synchronized (Test1.class) {
				if (t == null) {
					t = new Test1();
				}
			}
		}
		return t;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

}
