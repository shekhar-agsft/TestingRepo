package ru.parsentev.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	 WebDriver driver = new HtmlUnitDriver();
    		
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
        //assertTrue( true );
    }
}
