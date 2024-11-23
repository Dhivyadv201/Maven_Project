package com.testng;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "VEG")
	private void cudrRice() {
		System.out.println("CURDRICE");

	}

	@Test(groups = "VEG")
	private void vegRice() {
		System.out.println("VEGRICE");

	}

	@Test(groups = "VEG")
	private void geeRice() {
		System.out.println("GEERICE");

	}

	@Test(groups = "NONVEG")
	private void briyani() {
		System.out.println("BRIYANI");

	}

	@Test(groups = "NONVEG")
	private void mandhiBriyani() {
		System.out.println("MANDHIBRIYANI");
	}

	@Test(groups = "NONVEG")
	private void fishFry() {
		System.out.println("FISHFRY");
	}

	@Test(groups = "EC")
	private void mobile() {
		System.out.println("MOBILE");
	}

	@Test(groups = "EC")
	private void laptop() {
		System.out.println("LAPTOP");
	}

	@Test(groups = "EC")
	private void watch() {
		System.out.println("WATCH");
	}

}
