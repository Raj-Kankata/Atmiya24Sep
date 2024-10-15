package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xPathCssExamples {

	public static void main(String[] args) {
		//WebDriver d;
		
		//WebDriver d = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "chromediver.exe");
		
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		dr.manage().window().maximize();
		
		//WebElement user=dr.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[1]/input"));
		
		WebElement user=dr.findElement(By.xpath("//*[@id='username']"));
		//WebElement user=dr.findElement(By.xpath(""));
		//WebElement user=dr.findElement(By.xpath(""));
		//WebElement user=dr.findElement(By.xpath(""));
		
		//Absolute xpath - /html/body/div/main/div[2]/div[1]/form/div[1]/input
		//Relative xpath - //*[@id="email"]
		
		//cssSelector
		WebElement password = dr.findElement(By.cssSelector("input#password"));
		//WebElement user = dr.findElement(By.cssSelector("input.input_input"));
		
		
		user.sendKeys("new@test.com");
		password.sendKeys("abcd1234");
		
		//xPath:
		//tagname[attribute='value']
		//tagname.attribute value
		//#any of the attribute value
		//#email
		//*[@attribute="value"]
		//*[@id='session_password']
		//*[@id="password"]
		
		//cssSelector:
		//#session_password
		//css=tag#id
		//css=tag.class
		//css=tag[attribute=value]
		//css=tag.class[attribute=value]
		
		
		
		
	}

}
