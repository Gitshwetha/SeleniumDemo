package smokeTest;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RunSmoke {

	static WebDriver driver;
	
	@Test	// TODO Auto-generated method stub
	public void Logo() {
	WebElement logo =  driver.findElement(By.xpath("//*[contains(@class,'logo')]"));
			logo.isDisplayed();
      System.out.println("Company logo showing");
		
	}
	
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
		 System.out.println("Help document available");
				 
	}
		
		
	@BeforeClass
	public static void setupApplication() throws InterruptedException
	{
		System.out.println("Browser session started!");
		
		System.setProperty("webdriver.chrome.driver", "/selenium_work/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://applications.eu-1.celonis.cloud/process-mining/ui");
		Thread.sleep(4000);
					 WebElement username = driver.findElement(By.name("username"));
			    WebElement password = driver.findElement(By.name("password"));
			    username.sendKeys("mshweth6@gmail.com");
			    password.sendKeys("P@ssword1"); 
			    driver.findElement(By.className("btn-text")).click();
			    Thread.sleep(5000);
		 
		
	}
	@AfterClass
	public static void closeApplication()
	{
		driver.quit();
		System.out.println("Browser session ended");
		 // driver.findElement(By.xpath("//button[starts-with(@class,'ce-user-menu')]")).click();
		 // driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
	}

}
