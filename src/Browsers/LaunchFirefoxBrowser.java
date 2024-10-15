package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		

	
		//System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationPractice\\Selenium_jar_files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C://AutomationPractice//Selenium_jar_files//geckodriver-v0.35.0-win-aarch64//geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com/");
		//driver.close();
		
		 WebDriver fr = new FirefoxDriver(); 
		  fr.get("https://www.linkedin.com/"); 
		//fr.close();
		 
		

	}

}
