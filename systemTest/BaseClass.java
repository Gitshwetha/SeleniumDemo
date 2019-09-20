package systemTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    static WebDriver driver;
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
