package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test(groups="flavour")
  public void f() {
	  System.out.println("i am venilla");
  }
	@Test(groups="flavour")  
	  public void g() {
		System.out.println("i am ice cream");
	}
	@Test(groups="fruit")
	public void h() {
		System.out.println("i am grape");
	}
  
  @BeforeTest
  public void beforeTest() {
  }

}
