package testScripts;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement menu = driver.findElement(By.linkText("Components"));
		WebElement menuitem = driver.findElement(By.className("nav-link"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).click(menuitem).build().perform();
		driver.findElement(By.name("search")).sendKeys("phone");
		driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']"));
		//driver.close();
		driver.findElement(By.linkText("iPhone")).click();
		actions.scrollToElement(driver.findElement(By.id("button-cart"))).perform();
	}

}
