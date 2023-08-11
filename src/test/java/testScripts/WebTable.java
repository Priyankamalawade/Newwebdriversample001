package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/table-sort-search-demo.html");
		String strSalary = driver.findElement(By.xpath("//td[contains(text(), 'Wagner' )]//following-sibling::td[5]")).getText();
		System.out.println(strSalary);
		//string position = driver.findElement(By.tagName("td")).toRightof(By.xpath("//td[contains(text(), 'Wagner'"))
		

	}

}
