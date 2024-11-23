package com.testng;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	private void sampleOne() {
		System.out.println("SampleOne");
	}

	@Test
	private void sampleTwo() {
		
		System.out.println("SampleTwo");
	}

	@Test(dependsOnMethods = {"sampleOne","sampleTwo"})
	private void sampleThree() {
		System.out.println("SampleThree");
	}

}
