package Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertExamples {

	public static void main(String[] args) {
		WebDriver Driver;
		
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		//driver.switchTo().alert().sendKeys("My Selenium Alert class");
		
		//driver.switchTo().alert().dismiss();
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().alert().accept();
		
		
		

	}

}
