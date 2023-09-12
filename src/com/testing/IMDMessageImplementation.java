package com.testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IMDMessageImplementation implements IMDMessage {

	private List<IMDField> list = new ArrayList<>();

	public IMDMessageImplementation() {
		IMDField f1 = new IMDFieldImplementation("Shiv");
		IMDField f2 = new IMDFieldImplementation("Bhola");
		IMDField f3 = new IMDFieldImplementation("Shambhu");

		list.add(f1);
		list.add(f2);
		list.add(f3);
	}

	@Override
	public Iterator<IMDField> iterator() {
		return list.iterator();
	}

	@Override
	public IMDField getField(String fieldName) {
		return list.stream().filter(f -> f.getName().equals(fieldName)).findFirst().get();
	}

}
