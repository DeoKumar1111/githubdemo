package com.deo.autmation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver fddriver = new FirefoxDriver();
		fddriver.get( " https://Gmail.com ");



	}

}
