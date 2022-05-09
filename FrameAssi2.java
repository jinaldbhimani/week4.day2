package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssi2 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	       
	       driver.switchTo().frame("frame1");
	       driver.switchTo().frame("frame3");
	       driver.findElement(By.xpath("//input[@id='a']")).click();
	       driver.switchTo().defaultContent();
	       
	       driver.switchTo().frame("frame2");
	       WebElement animal = driver.findElement(By.id("animals"));
	       Select dropdown=new Select(animal);
	       dropdown.selectByIndex(2);
	       driver.switchTo().defaultContent();
	       
	       
	       
	       
	       
	       

	}

}
