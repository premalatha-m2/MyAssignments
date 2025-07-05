package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Createaccountdropdown {

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
			WebElement industryDd= driver.findElement(By.name("industryEnumId"));
			Select dd1=new Select(industryDd);
			dd1.selectByIndex(3);
			WebElement ownershipdd=driver.findElement(By.name("ownershipEnumId"));
			Select dd2= new Select(ownershipdd);
			dd2.selectByVisibleText("S-Corporation");
			WebElement sourcedd=driver.findElement(By.name("dataSourceId"));
			Select dd3= new Select(sourcedd);
			dd3.selectByValue("LEAD_EXISTCUST");
			WebElement Marketingdd=driver.findElement(By.name("marketingCampaignId"));
			Select dd4= new Select(Marketingdd);
			dd4.selectByIndex(6);
			WebElement statedd=driver.findElement(By.name("generalStateProvinceGeoId"));
			Select dd5= new Select(statedd);
			dd5.selectByValue("TX");
			driver.findElement(By.className("smallSubmit")).click();
		    System.out.println(driver.getTitle());
			driver.close();
			
			
			
			
			
			

	}

}
