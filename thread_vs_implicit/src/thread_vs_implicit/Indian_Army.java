package thread_vs_implicit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indian_Army {
	WebDriver driver;
	void army() {
		driver=new ChromeDriver();
		//set property
		System.setProperty("webdriver.chrome.driver","");
		driver.get("https://indianarmy.nic.in/index.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='Default3.aspx?MenuId=VR236967ZGauZ4QhCcqwtA==']")).click();
		
		
		
	}
	public static void main(String[] args) {
		Indian_Army i=new Indian_Army();
		i.army();
	}

}
