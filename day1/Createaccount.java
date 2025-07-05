package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Createaccount {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
	        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			
			WebElement pwd = driver.findElement(By.name("PASSWORD"));
			pwd.sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM")).click();
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Testing");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.className("smallSubmit")).click();
			System.out.println(driver.getTitle());
			driver.close();

	}

}
