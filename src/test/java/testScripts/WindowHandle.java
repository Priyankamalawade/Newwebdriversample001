package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent window .."+ parentWin);
		driver.findElement(By.xpath("//button[contains(text(), ' Click to open new Tab ')]")).click();
		Set<String> wins = driver.getWindowHandles();
		System.out.println("no of wins.."+ wins.size());
		for(String tab : wins) {
			System.out.println(tab);
			if(!tab.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(tab);
				driver.findElement(By.xpath("//span[contains(text(), 'Java')]")).click();
			}
						
		}
		//driver.close();
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//button[contains(text(), ' Click to open new Window')]")).click();
		//driver.quit();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.selenium.dev/blog/");

	}

}
