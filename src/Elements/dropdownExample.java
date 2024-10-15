package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownExample {

	public static void main(String[] args) {
		//WebDriver d;
		
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement we = d.findElement(By.id("dropdown"));
		
		Select sl = new Select(we);
		sl.selectByVisibleText("Option 2");
		
		

	}

}
