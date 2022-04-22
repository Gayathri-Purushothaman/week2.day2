package week2.day2;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		
		
		driver.findElement(By.id("position")).click();
	Point pt=driver.findElement(By.id("position")).getLocation();
System.out.println(pt);
driver.findElement(By.id("color")).click();

	System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
	driver.findElement(By.id("size")).click();
	org.openqa.selenium.Dimension dim=driver.findElement(By.id("size")).getSize();
	System.out.println(dim);
	}

}
