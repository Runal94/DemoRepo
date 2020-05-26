package com.cg.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestClass {
	
	public WebDriver driver;
	Properties property;
	public BaseTestClass() throws Exception 
	{
		property=new Properties();
		FileInputStream fis=new FileInputStream("/Users/runal/BasicJava/SampleMavenProject/src/main/java/com/cg/config/Config.properties");
		property.load(fis);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver", "/Users/runal/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get(property.getProperty("url"));
		System.out.println(1);
	}
	
	public void init(int a)
	{
		
	}
	
	
	
	
}
