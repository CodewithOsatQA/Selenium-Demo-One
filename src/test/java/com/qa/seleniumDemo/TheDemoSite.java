package com.qa.seleniumDemo;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheDemoSite {
	
	private WebDriver webDriver;
	
	@BeforeEach
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\otowe\\projects\\SpringBoot\\notesProject\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().setSize(new Dimension(1366, 768));
	}
	
	@Test
	public void theDemoSite() {
		webDriver.get("http://thedemosite.co.uk");
		try {
			Thread.sleep(2000);
		WebElement target = webDriver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		target.click();
			Thread.sleep(5000);
		String username1 = "hello world";
		String pass = "safe";
		target = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		target.sendKeys(username1);
		
		target = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		target.sendKeys(pass);
		target = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		target.submit();
		
		Thread.sleep(5000);
		
		target = webDriver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		target.click();
		
		target = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		target.sendKeys(username1);
		target = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		target.sendKeys(pass);
		
		target = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		target.click();
		
		//assertEquals(username,"hello world");
		//assertEquals("hello world", username);
		
		//
		// 
		
		String test = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
		assertEquals("**Successful Login**", test);
	}
	catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	 @AfterEach
	    public void tearDown() {
	        webDriver.close();
	    }

}
