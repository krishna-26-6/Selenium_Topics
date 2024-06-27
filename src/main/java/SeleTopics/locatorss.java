package SeleTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locatorss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	//	1.Find the locator for amazon logo button and perform click action on it
		driver.findElement(By.id("nav-logo-sprites")).click();
		
		
		//2.Enter the text in amazon search bar and click on search logo button
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));


 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("umbrella");
 driver.findElement(By.id("nav-search-submit-button")).click();
		 
		// 3.Click on a product in Product resultant page
		 


	}

	
	
}
