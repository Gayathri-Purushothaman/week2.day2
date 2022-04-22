package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::img")).click();
	
		driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image'][@alt='Images']")).click();
		
		String url=driver.findElement(By.xpath("//label[@for='position']/following-sibling::img")).getAttribute("href");

		if(url=="null")
		{
			System.out.println("The image is broken");
		}
		

driver.findElement(By.xpath("//label[@for='position'][contains(text(),'Keyboard or Mouse')]/following-sibling::img")).click();
	}

}
			
		
		
		
		
		
		