package com.deo.autmation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.youtube.com");
		cdriver.manage().window().maximize();
		WebElement search=cdriver.findElement(By.cssSelector("input[id='search']"));
		search.sendKeys("amplifier");
		Thread.sleep(2000);
		WebElement button=cdriver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
		button.click();
		Thread.sleep(2000);
		WebElement play=cdriver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']"));
		play.click();
		
		

	}

}
