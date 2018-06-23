package hospitsl_buildings;

import org.testng.annotations.Test;

import login_module.loginTest;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Hospital_buildingTest extends loginTest {
	
	WebDriver driver;
	
 
  @Test(priority=1)
  public void f() {
	  driver.findElement(By.xpath("//span[contains(text(),'Hospital Buildings')]")).click();
	  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitallocation/create']")).click();
	  driver.findElement(By.id("Hospitallocation_buidingname")).sendKeys("jyothi");
	  driver.findElement(By.xpath("//input[@id='Hospitallocation_buildingcode']")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click();
  }
  
  @BeforeTest(enabled=false)
  
  public void beforeTest() {
	/* System.setProperty("webdriver.chrome.driver","C:\\Users\\edu10\\Desktop\\selenium automation\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php/user/login");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  */
  }

  @AfterTest
  public void afterTest() {
  }

}
