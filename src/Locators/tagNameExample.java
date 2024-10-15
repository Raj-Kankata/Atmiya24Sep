package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagNameExample {

	public static void main(String[] args) {
		//WebDriver d;
		
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		d.get("https://demo.guru99.com/test/newtours/");
	  //d.get("https://flipkart.com");
		
		//WebElement e = d.findElement(By.name(""));
		List<WebElement> links = d.findElements(By.tagName("a"));
		
		//ele1
		//ele2
		//ele3
		
		
		System.out.println(links.size());
		//Home and Flights
		
		String[] linktext = new String[links.size()];
		//linktext[0]="Home";
		//linktext[1]="New"
		
		int i=0;
		for(WebElement e:links) {
			linktext[i]=e.getText(); //at 0th index first element text will be stored
			i++;
		}
		//linktext[0]=Home;
		//linktext[1]=Flight;
		//linktext[2]=Destinations;
		//linktext[3]=Hotels;
		
		for(String t: linktext) {
			d.findElement(By.linkText(t)).click();
			//System.out.println("First value");
			String at = d.getTitle();
			
			if(at.equals("Under Construction: Mercury Tours")) {
				System.out.println(t+" is not working");
			}else {
				System.out.println(t+" is working");
			}
			d.navigate().back();
			
		}
		
		
		
		

	}

}
