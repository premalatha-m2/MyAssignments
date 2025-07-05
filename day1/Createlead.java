package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Createlead {
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
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Premalatha");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
			driver.findElement(By.name("submitButton")).click();
		    System.out.println(driver.getTitle());
			driver.close();
			
	}		
			
}
