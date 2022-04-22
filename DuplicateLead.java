package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead  {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//span[text()='Email']")).click();
driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gayathri");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(3000);
String str=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')]/a")).getText();
driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
driver.findElement(By.linkText("Duplicate Lead")).click();
String title=driver.getTitle();
if(title.equals("Duplicate Lead | opentaps CRM"))
{
	System.out.println("The title of the page is duplicate lead");
	driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	if(str.equals(driver.findElement(By.id("viewLead_firstName_sp")).getText()))
	{
		System.out.println("The duplicated lead name is same as Captured Lead name");
	}
	else
	{
		System.out.println("The duplicated lead name is not same as Captured Lead name");
	}
}
else
{
	System.out.println("The title of the page is not duplicate lead");
}
Thread.sleep(3000);

driver.close();
	}

}
