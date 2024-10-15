package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framesExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		//WebDriver d;
		WebDriver d = new FirefoxDriver();
		d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//d.findElement(By.xpath("//*[@id=\"all-packages-table\"]/div[2]/div[3]/a"));
			
		d.switchTo().frame("packageListFrame");
		
		d.findElement(By.linkText("org.openqa.selenium.cli")).click();
		
		d.switchTo().frame("classFrame");
			

	}

}
