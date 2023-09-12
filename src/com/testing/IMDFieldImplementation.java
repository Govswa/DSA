package com.testing;

public class IMDFieldImplementation implements IMDField {

	private String name;

	public IMDFieldImplementation(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "IMDFieldImplementation [name=" + name + "]";
	}

}
