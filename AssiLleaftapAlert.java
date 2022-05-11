package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssiLleaftapAlert {

	public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps/control/login");
	       driver.manage().window().maximize();
	   	   driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   driver.findElement(By.className("decorativeSubmit")).click();
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		   driver.findElement(By.linkText("Merge Contacts")).click();
		   driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		   Thread.sleep(3000);
		   Set<String> window1 = driver.getWindowHandles();
		   List<String>windowlist=new ArrayList<String>(window1);
		   
		   driver.switchTo().window(windowlist.get(1));
		   driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		   driver.switchTo().window(windowlist.get(0));
		
		   
		   driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		   Thread.sleep(3000);
		   Set<String> window2 = driver.getWindowHandles();
		   List<String>windowlist2=new ArrayList<String>(window2);
		   driver.switchTo().window(windowlist2.get(1));
		   driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		   driver.switchTo().window(windowlist2.get(0));
		   driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
			
			  driver.switchTo().alert().accept();
			 
			  String text =driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
			  
			  System.out.println(text);
			
		   
		   
		   
		   
		   
		   
		   
		   							
		   
		   
		   
		   

	}

}
