package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/Window.html");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("home")).click();
	       String windowHandle = driver.getWindowHandle();
	       System.out.println(windowHandle);
	       
	       Set<String> windowHandles = driver.getWindowHandles();
	      System.out.println(windowHandles);
	      
	      List<String>windowList=new ArrayList<String>(windowHandles);
	      String windowNew = windowList.get(1);
	     
	      System.out.println(driver.getCurrentUrl());
	      System.out.println(driver.getTitle());
	      
	      driver.switchTo().window(windowNew);
	      System.out.println(driver.getCurrentUrl());
	      System.out.println(driver.getTitle());
	      
	      driver.switchTo().window(windowList.get(0));
	      System.out.println(driver.getCurrentUrl());
	      System.out.println(driver.getTitle());
	      
	      
	  
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
