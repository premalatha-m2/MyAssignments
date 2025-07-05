package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkbox {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Define the XPath for the visible checkbox element
        String visible_checkbox_element_xpath = "//div[@id='j_idt87:j_idt89']/div[contains(@class, 'ui-chkbox-box')]";

        // Initialize WebDriverWait for explicit waits
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the element is clickable and then click it
        WebElement checkbox_box = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath(visible_checkbox_element_xpath)));
        checkbox_box.click();
        
        String visible_notification_element_xpath="//div[@id='j_idt87:j_idt91']/div[contains(@class, 'ui-chkbox-box')]";
        WebElement notifi_box = wait.until( ExpectedConditions.elementToBeClickable(By.xpath(visible_notification_element_xpath)));
        notifi_box.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'ui-growl-item-container')]//span[@class='ui-growl-title' and text()='Checked']")));
		WebElement language=driver.findElement(By.xpath("//input[@id='j_idt87:basic:0']/ancestor::div[contains(@class, 'ui-chkbox ui-widget')]/div[contains(@class, 'ui-chkbox-box')]"));
		language.click();
		WebElement tristate=driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[contains(@class, 'ui-chkbox-box')]"));
		tristate.click();
		WebElement toggle=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']/div[contains(@class, 'ui-toggleswitch')]"));
		toggle.click();
		
		WebElement citiesdd= driver.findElement(By.id("j_idt87:multiple"));
		Select dd1= new Select(citiesdd);
		dd1.selectByIndex(0);
		}

}
