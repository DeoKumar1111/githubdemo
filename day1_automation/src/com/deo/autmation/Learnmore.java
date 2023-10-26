package com.deo.autmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class Learnmore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.gmail.com");
		cdriver.manage().window().maximize();
	WebElement learnm = cdriver.findElement(By.linkText("Learn more"));
	learnm.click();
	
	System.out.println( "Parent Tab" + cdriver.getWindowHandle());
	java.util.Set<String> allTabs=cdriver.getWindowHandles();
	
for( String x:allTabs)
{
	System.out.println(x);
	cdriver.switchTo().window(x);
}
cdriver.findElement(By.linkText("Use Chrome with multiple profiles")).click();
}

}
