package week2.day2;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead   {

	public static void main(String[] args)throws InterruptedException {
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstName'][@style='width: 212px;']")).sendKeys("gayathri");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
String title=driver.getTitle();
if(title.equals("View Lead | opentaps CRM"))
{
	System.out.println("The title of the page is View lead");
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	driver.findElement(By.xpath("//input[@name='submitButton'][@value='Update']")).click();
	String companyName=driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if(companyName.contains("TCS"))
	{
		System.out.print("The company name updated as"+companyName);
	}
	else
	{
		System.out.println("The comapny name not updated");
	}
}
else
{
	System.out.println("The title of the page is not view lead");
}
Thread.sleep(3000);
driver.close();


	}

}
