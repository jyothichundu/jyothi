package login_module;

import org.testng.annotations.Test;

import hospitsl_buildings.Hospital_buildingTest;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class loginTest{
	
	WebDriver driver;
	
  @Test
  public void login(Hospital_buildingTest hs) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\edu10\\Desktop\\selenium automation\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php/user/login");
      driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  hs.f();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\edu10\\Desktop\\selenium automation\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php/user/login");
      driver.manage().window().maximize();
      Hospital_buildingTest hs = new Hospital_buildingTest();
      login(hs);
      
  }

  @AfterTest
  public void afterTest() {
  }

}
