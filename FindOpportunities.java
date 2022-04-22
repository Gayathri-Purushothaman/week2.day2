package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindOpportunities {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@class='inputLogin'][@type='text']")).sendKeys("demosalesmanager");
driver.findElement(By.xpath("//input[@class='inputLogin'][@type='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
	driver.findElement(By.xpath("//a[text()='Find Opportunities']")).click();
	List<WebElement> oppList=driver.findElements(By.xpath("//table//td[contains(@class,'OpportunityId')]"));
	String str=driver.getTitle();
	
	if(oppList.size()==0)
	{
		System.out.println("No records to display");
	}
	else
	{
	for(int i=1;i<oppList.size();i++)
	{
		WebElement we=oppList.get(i);
		System.out.println(we.getText());
	}
	}
	if(str.equals("Find Opportunities | opentaps CRM"))
	{
		System.out.println(driver.getTitle()+" is the expected title of the webpage");
	}
	else
	{
		System.out.println(driver.getTitle()+" is not the expected title of the webpage");
	}
	}

}
