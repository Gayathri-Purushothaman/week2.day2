package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra_Classwork2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.myntra.com");
		driver.manage().window().maximize();	
driver.findElement(By.xpath("//a[@data-group='men']")).click();
driver.findElement(By.xpath("//li[@data-reactid='63']/a")).click();
driver.findElement(By.xpath("//label[contains(text(),'Flying Machine')]/div[@class='common-checkboxIndicator']")).click();
//driver.findElement(By.xpath("//label[contains(text(),'Flying Machine')]/div")).click();
//driver.findElement(By.xpath("//input[@type='checkbox'][@value='Flying Machine']/following-sibling::div[@class='common-checkboxIndicator']")).click();
//driver.findElement(By.xpath("//input[@type='checkbox'][@value='Flying Machine']/following-sibling::div")).click();

}

}
