package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframetest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String strlb1 = driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(strlb1);
		//page to frame
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("priyanka");
		//frame1 to frame3
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		//frame3 to frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi Hello");
		//frame to main page
		driver.switchTo().defaultContent();
		strlb1 = driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(strlb1);
		
		

	}

}
