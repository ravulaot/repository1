package com.test;
import org.testng.annotations.Test;
import com.base.BaseClass;

public class SampleTest extends BaseClass {
	 String k="Jyothi";
	@Test
	 void testCase1() {
		// String k="Jyothi";

		System.out.println("This is testCase1");
		System.out.println("This is New Comment");
		System.out.println("This is New Comment2");
		System.out.println("Jyothi again test code changes");
	}
	@Test
	public void testCase2() {

		System.out.println("This is testCase2");

	}
	@Test
	public void testCase3() {

		System.out.println("This is testCase3");
	}
	
	
	

}
