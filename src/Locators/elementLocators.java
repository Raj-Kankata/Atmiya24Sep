package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementLocators {

	public static void main(String[] args) {

		//WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		//Enter username - name=session_key
		//driver.findElement(By.name("session_key")).sendKeys("rajkumarkankata@gmail.com");
		
		WebElement user = driver.findElement(By.name("session_key"));
		user.sendKeys("rajkumarkankata@gmail.com");
		
		//Enter passoword
		WebElement password = driver.findElement(By.name("session_password"));
		password.sendKeys("nocompromise");
		
		//Click on Join Now
		WebElement joinnow = driver.findElement(By.id("join_now"));
		joinnow.click();
		
		//forgort password
		//WebElement fpassword = driver.findElement(By.linkText("Forgot password?"));
		WebElement fpassword = driver.findElement(By.partialLinkText("Forgot"));
		fpassword.click();
		
		//clink Signin
		WebElement signin = driver.findElement(By.className("btn__primary--large from__button--floating"));
		signin.click();

	}

}
