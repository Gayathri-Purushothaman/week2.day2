package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement usingIndex=driver.findElement(By.id("dropdown1"));
		Select d1=new Select(usingIndex);
		d1.selectByIndex(2);
		WebElement usingText=driver.findElement(By.name("dropdown2"));
		Select d2=new Select(usingText);
		d2.selectByVisibleText("Loadrunner");
		WebElement usingValue=driver.findElement(By.name("dropdown3"));
		Select d3=new Select(usingValue);
		d3.selectByValue("3");
		WebElement totalNoOfOptions=driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select d4=new Select(totalNoOfOptions);
	int size=d4.getOptions().size();
		System.out.println("The total number of options "+size);
		WebElement sendKeys=driver.findElement(By.xpath("//option[contains(text(),'You can also use sendKeys')]/ancestor::div[@class='example']/select"));
		sendKeys.sendKeys("UFT/QTP");
		WebElement multiple=driver.findElement(By.xpath("//option[contains(text(),'Select your programs')]/ancestor::div[@class='example']/select"));
		Select d6=new Select(multiple);
	if(d6.isMultiple())
	{
		d6.selectByIndex(1);
		d6.selectByVisibleText("Appium");
		System.out.println("The selected values in the drop down");
		List <WebElement> selectedOptions=d6.getAllSelectedOptions();
		for(WebElement we:selectedOptions)
		{
			System.out.println(we.getText());
		}
	}
	driver.close();

	}

}
