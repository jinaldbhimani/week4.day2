package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssiLleaftapAlert {

	public static void main(String[] args) {
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps/control/login");
	   	   driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   driver.findElement(By.className("decorativeSubmit")).click();
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		   driver.findElement(By.xpath("//a[@id='ext-gen868']")).click();

	}

}
