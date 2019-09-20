package testing;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SmokeTest extends BaseClass{
	@Test 
	public void YourHelpDocument() throws Throwable{
		String Hometab = driver.getWindowHandle();
		//WebDriverWait  wait = new 	WebDriverWait(driver,3);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Need Help?')]"))).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement help = driver.findElement(By.xpath("//button[starts-with(@class, 'ce-help-guide')]"));
		actions.moveToElement(help).perform();
		help.click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Workspaces view");
		 driver.findElement(By.xpath("//a[starts-with(@class, 'ce-help-guide')]")).click();
		 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		 newTab.remove(Hometab);
		 driver.switchTo().window(newTab.get(0));
		 System.out.println(driver.getTitle());
				 
	}

}
