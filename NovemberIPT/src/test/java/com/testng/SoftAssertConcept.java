package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConcept {

	@Test
	private void demo() {
		String act = "Raja";
		String exp = "raja";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(act, exp);
		System.out.println("Verification");

	}

}
