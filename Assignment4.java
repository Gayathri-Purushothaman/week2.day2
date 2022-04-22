package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("I am an appended text",Keys.TAB);
		String str=driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getAttribute("value");
		System.out.println(str);
		
		driver.findElement(By.xpath("//input[@name='username'][@value='Clear me!!']")).clear();
	boolean a=driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
	if(a==false)
	{
		System.out.println("Yes, the field is disabled");
	}
	else
	{
		System.out.println("No, the field is enabled");
	}
	
	driver.close();
	}

	
}
