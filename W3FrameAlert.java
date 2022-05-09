package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3FrameAlert {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	       driver.manage().window().maximize();
	       driver.switchTo().frame("iframeResult");
	       driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click( );
	       Alert alert = driver.switchTo().alert();
	       alert.sendKeys("jinal");
	       alert.accept();
	       String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	       System.out.println(text);
	       
	       

	}

}
