package testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AutoCheck extends BaseClass{
	
	
	@Test
	 public void WorkspacesList() throws Throwable{
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
 


}

