package Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framesExample2 {

	static WebDriver d;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		d = new FirefoxDriver();
		d.get("https://demoqa.com/frames");
		
		//By executing a Java script
		JavascriptExecutor exe = (JavascriptExecutor) d;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are "+ numberOfFrames);
		
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = d.findElements(By.tagName("iframe"));
		
		System.out.println("The total number of iframes are "+ iframeElements.size());
		
		//Switch by Index
		d.switchTo().frame(0);
		d.quit();
		
		//Switch by frame name
		d.switchTo().frame("iframe1");
		d.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
