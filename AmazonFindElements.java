package week2.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFindElements {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("USI Punching bag",Keys.ENTER);
	driver.findElement(By.xpath("//span[contains(text(),'Eligible for Pay On Delivery')]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	//int count=driver.findElements(By.tagName("a")).size();
	//List<WebElement> weList=driver.findElements(By.xpath("//a[@target='_blank']"));
	
	//System.out.println(driver.findElement(By.xpath("(//h2/a[@target='_blank']/span)[1]")).getText());[contains(text(),'USI')]
List<String> str=new ArrayList<String>();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
List<WebElement>weList=driver.findElements(By.xpath("//a[@target='_blank']/span"));
System.out.println(weList.size());
for(WebElement we1:weList)
{

String text=we1.getText();
str.add(text);

}

for(int i=1;i<weList.size();i++)
	{
System.out.println(str.get(i));	
}
str.clear();

	}

}
