package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertConcept {
	@Test
	private void demo() {
		String act = "Raja";
		String exp = "Raja";
		Assert.assertEquals(act, exp);
		System.out.println("Validation");

	}
}
