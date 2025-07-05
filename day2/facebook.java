package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class facebook {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.name("firstname")).sendKeys("Premalatha");
			driver.findElement(By.name("lastname")).sendKeys("N");
			driver.findElement(By.name("reg_email__")).sendKeys("1234567777");
			driver.findElement(By.name("reg_passwd__")).sendKeys("testleaf123");
			WebElement daydd=driver.findElement(By.id("day"));
			Select dd1=new Select (daydd);
			dd1.selectByValue("23");
			WebElement monthdd=driver.findElement(By.id("month"));
			Select dd2=new Select (monthdd);
			dd2.selectByVisibleText("Jan");
			WebElement yeardd=driver.findElement(By.id("year"));
			Select dd3=new Select (monthdd);
			dd2.selectByValue("2019");
			driver.findElement(By.xpath("//input[@value='1']")).click();
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			WebElement radiobutton = wait.until(
//		            ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio' and @name='sex' and @value='1']")));
//			if (!radiobutton.isSelected()) {
//                radiobutton.click();
//                System.out.println("Clicked the 'Female' radio button.");
//            } else {
//                System.out.println("'Female' radio button was already selected.");
//            }
//		        
	}

}
