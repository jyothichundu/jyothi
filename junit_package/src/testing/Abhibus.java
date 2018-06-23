package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {
	WebDriver Abhibus;
	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\edu10\\Desktop\\selenium automation\\chromedriver.exe");
		Abhibus=new ChromeDriver();
		{
		Abhibus.get("https://www.abhibus.com");
		Abhibus.manage().window().maximize();
		}

		
		
	}

	public void booking() {
		Abhibus.findElement(By.id("source")).sendKeys("guntur");
		Abhibus.findElement(By.id("destination")).sendKeys("tirupathi");
		Abhibus.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Abhibus.findElement(By.id("datepicker1")).click();
		Abhibus.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Abhibus.findElement(By.xpath("//html//div[@class='ui-datepicker-group ui-datepicker-group-first']//tr[4]/td[3]/a[1]")).click();
		Abhibus.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Abhibus.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[1]/div[3]/a[1]")).click();
		
		}
	public static void main(String[] args) {
		Abhibus y=new Abhibus();
		y.browser();
		y.booking();

	}

}
