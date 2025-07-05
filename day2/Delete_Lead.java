package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete_Lead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		WebElement pwd = driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		By firstLeadRowLocator = By.xpath("//div[@class='x-grid3-body']/div[contains(@class, 'x-grid3-row')][1]");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement leadrow = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='x-grid3-body']/div[contains(@class, 'x-grid3-row')][1]")));
		leadrow.click();
		WebElement leadIdLink = wait.until(ExpectedConditions.elementToBeClickable(
                leadrow.findElement(By.xpath(".//td[contains(@class, 'x-grid3-td-partyId')]//a[@class='linktext']"))
            ));
		  String firstLeadId = leadIdLink.getText().trim();
		leadIdLink.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.id("ext-gen246")).sendKeys(firstLeadId);
		driver.findElement(By.id("ext-gen334")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 By noRecordsMessageLocator = By.id("ext-gen437");
		 
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement noRecordsMessageElement = wait1.until(
	                ExpectedConditions.visibilityOfElementLocated(noRecordsMessageLocator)
	            );
		 String messageText = noRecordsMessageElement.getText().trim();
		 if (messageText.equals("No records to display")) {
             System.out.println("VERIFICATION PASSED: 'No records to display' message is correctly displayed.");
         } else {
             System.out.println("VERIFICATION FAILED: Expected 'No records to display' but found: '" + messageText + "'");
         }
		
		driver.close();

	}

}
