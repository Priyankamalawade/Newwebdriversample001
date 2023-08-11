package testScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.id("APjFqb"));
		element.sendKeys("Java Tutorials");
		//element.sendKeys(Keys.ENTER);
		//String title = driver.getTitle();
		//System.out.println("Page title..." + title);
		//System.out.println("Page url..." + driver.getCurrentUrl());
		Thread.sleep(2000);
					
	
		
			
		

	}

}
