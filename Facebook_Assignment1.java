package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Assignment1 {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("test1");
		driver.findElement(By.name("lastname")).sendKeys("test2");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9198765435");
		driver.findElement(By.id("password_step_input")).sendKeys("xswdfgth");
		WebElement d=driver.findElement(By.id("day"));
		Select d1=new Select(d);
		d1.selectByValue("11");
		WebElement month=driver.findElement(By.id("month"));
		Select mon=new Select(month);
		mon.selectByValue("1");
		WebElement year=driver.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByValue("1990");
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
