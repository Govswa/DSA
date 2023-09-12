package com.testing;

import java.math.BigDecimal;

public class IMDTesting {

	public static void main(String[] args) {
		IMDMessageImplementation message = new IMDMessageImplementation();
		onMessage(message);

		/*
		 * BigDecimal b = new BigDecimal(0); if(b.intValue() == 0) {
		 * System.out.println("hi"); }
		 */
	}

	public static void onMessage(IMDMessageImplementation message) {
		message.getField("Shiv");
		message.forEach(field -> {
			//if (field.getName().equals("Shiv")) {
				System.out.println(field.getName());
				System.out.println(field.toString());
			//}
		});
	}
}
