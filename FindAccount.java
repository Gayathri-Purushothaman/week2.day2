package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount  {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.xpath("//label[text()='Account Name:'][@class='x-form-item-label']/following-sibling::div[@class='x-form-element'][@style='padding-left:155px']/input[@name='accountName'][@class=' x-form-text x-form-field']")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		String str=driver.findElement(By.xpath("//input[@id='accountName']")).getAttribute("value");
		if(str.equals("Credit Limited Account"))
		{
			System.out.println("The account name fetched is as expected");
		}
		else
		{
			System.out.println("The account name fetched is not as expected");
		}
	System.out.println(driver.findElement(By.xpath("//textarea[@name='description']")).getText());	
	String title=driver.getTitle();
			if(title.contains("Edit Account"))
			{
				System.out.println("The title of the page - "+title+" is as expected");
			}
		driver.close();
	}

}
