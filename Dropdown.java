package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	//sselect by index
		WebElement byindex = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select drop1=new Select(byindex);
		drop1.selectByIndex(2);
		
	//select by text
		WebElement text = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select drop2=new Select(text);
		drop2.selectByVisibleText("Selenium");
		
	//SELECT BY VALUE
		WebElement value = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select drop3=new Select(value);
		drop3.selectByValue("2");
		
	//select by getoption
		  WebElement option = driver.findElement(By.xpath("//select[@class='dropdown']"));
		  Select drop4=new Select(option);
		  List<WebElement> options1 = drop4.getOptions();
		  for(WebElement eachoptions1:options1)
				  {
					  System.out.println(eachoptions1.getText());
		  }
		  
		  //select by send key
		  WebElement sendkey = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		  Select drop5=new Select(sendkey);
		 sendkey.sendKeys("Loadrunner");
		  
		  
		  
	}
}
		
		
		
		
		
		
		
		
		
		
	


