package testing;

import static org.junit.Assert.*;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Passport {
		WebDriver Passport;
		@Before
	public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\edu10\\Desktop\\selenium automation\\chromedriver.exe");
			Passport=new ChromeDriver();
		Passport.navigate().to("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		Passport.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Passport.findElement(By.xpath("//input[@id='frmSample_register']")).click();
		
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		new Select(Passport.findElement(By.xpath("//select[@id='dcdrLocation']"))).selectByIndex(04);
		Passport.findElement(By.xpath("//input[@id='givenName']")).sendKeys("jyothi");
		Passport.findElement(By.xpath("//input[@id='surname']")).sendKeys("chundu");
		Passport.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Passport.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		Passport.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Passport.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'19')]")).click();
		Passport.findElement(By.xpath("//input[@id='email']")).sendKeys("jyothichundu3@gmail.com");
		Passport.findElement(By.xpath("//input[@id='emailloginSameyes']")).click();
		Passport.findElement(By.xpath("//input[@id='loginId']")).sendKeys("jyothichundu3@gmail.com");
		Passport.findElement(By.xpath("//input[@id='pwd']")).sendKeys("jyothi78");
		Passport.findElement(By.xpath("//input[@id='confirmPwd']")).sendKeys("jyothi78");
		 new Select(Passport.findElement(By.xpath("//select[@id='hintQues']"))).selectByIndex(02);
		 Passport.findElement(By.xpath("//select[@id='hintQues']")).sendKeys("pink");
		 Passport.findElement(By.xpath("//input[@id='test123']")).sendKeys("Y893BL");
	}

}
