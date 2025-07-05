package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown {
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
		
		WebElement sourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDD );
		sel.selectByIndex(4);
		WebElement marketingDD=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1=new Select(marketingDD );
		sel1.selectByVisibleText("Automobile");
		WebElement ownershipDD=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel2=new Select(ownershipDD );
		sel2.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
	    System.out.println(driver.getTitle());
		driver.close();
		
}
}