package AutomationTestting.SeleAuto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicWait {

	
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//WebDriverWait wait=new WebDriverWait();
		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.className("dropbtn")).click();
		
		WebElement but = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("http://flipkart.com/")));
		but.click();

		
		
		
		
		
	
	
	
}
}