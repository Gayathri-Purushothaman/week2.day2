package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://www.myntra.com");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Shirt",Keys.ENTER);
		
		

driver.findElement(By.xpath("//span[@class='myntraweb-sprite filter-search-iconSearch sprites-search']")).click();
driver.findElement(By.xpath("//input[@type='text'][@placeholder='Search for Brand']")).sendKeys("Polo",Keys.ENTER);
driver.findElement(By.xpath("//input[@value='U.S. Polo Assn.']/following-sibling::div[@class='common-checkboxIndicator']")).click();
//WebElement we=driver.findElement(By.xpath("//ul[@class='sort-list']"));
List<WebElement>l=driver.findElements(By.xpath("//ul[@class='sort-list']"));
//driver.findElement(By.xpath("//ul[@class='sort-list']")).click();

for(WebElement we1:l)
{
	if(we1.getText().equals("What's New"))
	{
	we1.click();	
	}
}
//driver.findElement(By.xpath("//span[text()='Recommended']")).click();
//Actions builder=new Actions(driver);
//WebElement we=driver.findElement(By.xpath("//li//input[@value='new']"));
//WebDriverWait wait = new WebDriverWait(driver, 5000);
//wait.until(ExpectedConditions.visibilityOf(we)); 
//wait.until(ExpectedConditions.elementToBeClickable(we));
//builder.keyDown(Keys.ENTER).click(we).perform();

//Actions builder=new Actions(driver);
//builder.moveToElement(we).click().perform();

List<WebElement>priceList=driver.findElements(By.tagName("//div[@class='product-price']"));
for(WebElement we1:priceList)
{
	String text=we1.getText();
	System.out.println(text);
}


	}

}
