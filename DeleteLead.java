package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	//	driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String str=	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println(str);
	Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Delete']")).click();
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
driver.findElement(By.xpath("//input[@name='id']")).sendKeys(str);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(3000);
String deletedRecord=driver.findElement(By.xpath("//div[@class = 'x-paging-info']")).getText();
if(deletedRecord.equals("No records to display"))
{
	System.out.println("Record has been deleted");
}
else
{
	System.out.println("Record has not been deleted");
}
driver.close();
	}

}
