package testing;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunAuto {

	static WebDriver driver;
	
		// TODO Auto-generated method stub
		@Test
		 public void workspaceslist() throws InterruptedException{
			Thread.sleep(2000);
		 List<WebElement> allKPIs = driver.findElements(By.className("workspaces-list__overflow"));
		  System.out.println("Number of elements:" +allKPIs.size());
		  for (int i=0; i<allKPIs.size();i++){
		      System.out.println("Radio button text:" + allKPIs.get(i).getText());
		    }
			  assertEquals("--> SAP ECC - Order to Cash", allKPIs.get(0).getText());
			  WebElement firstworkpace =  allKPIs.get(0);
			  firstworkpace.click();
			  Thread.sleep(3000);
			 WebElement clicktile = driver.findElement(By.xpath("//*[@class='ce-tile__link ng-star-inserted']"));
					 clicktile.click();
			  Thread.sleep(4000);
			  if(driver.findElement((By.xpath("//span[text()='Order-to-Cash Analysis']"))).isDisplayed()){
				  System.out.println("got it");
				  
			  }
			  driver.findElement(By.xpath("//*[@title='Celonis Home']")).click();
			
			 
			 // Assert.assertEquals("--> SAP ECC - Purchase to Pay",allKPIs.get(1).getText());
			 // Assert.assertEquals("--> ServiceNow Ticketing",allKPIs.get(2).getText());
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
