package medicalboardSelect;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;


public class medicalboardselection extends BaseTest{
	
	@Test
	public static void select () throws InterruptedException {
		
		Thread.sleep(5000);
	    driver.findElement(By.cssSelector("#allf > div:nth-child(2) > div > .dropdown-btn")).click();
	    driver.findElement(By.cssSelector("#allf > div:nth-child(2) .dropdown-container > div:nth-child(1) .dropdown-btn")).click();
	    driver.findElement(By.linkText("Order Entry Medical Board")).click();
	    Thread.sleep(5000);
	}
	
	

}
