package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Sbi {
WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		System.out.println("hi");
	}

	@AfterClass
	public void tearDown() throws Exception {
		System.out.println("jyothi");
	}

	@Test
	public void test1() {
		System.out.println("hi");
	} 
	@Test
	public void test2() {
		System.out.println("bye");
	}

}
