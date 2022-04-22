package week2.day2;



import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Link.html");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.findElement(By.linkText("HyperLink")).click();
	String url=driver.findElement(By.partialLinkText("Find where am supposed to go")).getAttribute("href");
	System.out.println(url);
	String url2=driver.findElement(By.partialLinkText("Verify am I broken?")).getAttribute("href");
	if(url2.contains("error"))
	{
		System.out.println("The link "+url2+" is a broken link");
	}
	else
	{
		driver.findElement(By.partialLinkText("Verify am I broken?")).click();
	}
	driver.findElement(By.linkText("Go to Home Page")).click();
	driver.findElement(By.linkText("HyperLink")).click();
List<WebElement> noOfLinks=driver.findElements(By.tagName("a"));
System.out.println("The total number of links is"+noOfLinks.size());
for(WebElement link:noOfLinks)
{
	System.out.println(link.getText()+"-"+link.getAttribute("href"));
}
	}

}
