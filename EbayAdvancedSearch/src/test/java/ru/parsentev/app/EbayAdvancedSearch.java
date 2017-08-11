package ru.parsentev.app;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import junit.framework.TestCase;		
public class EbayAdvancedSearch extends TestCase {			
	 WebDriver driver = new HtmlUnitDriver();
	@Test
	public void setUp() throws Exception {
		  driver.get("http://www.google.com");			
		  // Locate the searchbox using its name		
          WebElement element = driver.findElement(By.name("q"));	
          
         // Enter a search query		
         element.sendKeys("Guru99");	
        
         // Submit the query. Webdriver searches for the form using the text input element automatically		
         // No need to locate/find the submit button		
         element.submit();			
         
 		// This code will print the page title		
         System.out.println("Page title is: " + driver.getTitle());		
         
         driver.quit();		
		//selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}
	
	
	
		
}