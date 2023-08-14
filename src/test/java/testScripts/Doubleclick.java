package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		Thread.sleep(1000);
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(), 'Double')]"));
		actions.doubleClick(btn).doubleClick(btn).build().perform();
		

	}

}
