package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadOptional {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Nexware");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Purushothaman");
			WebElement we1=driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
			Select s1=new Select(we1);
			s1.selectByVisibleText("Employee");
			WebElement we2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select s2=new Select(we2);
			s2.selectByValue("9001");
			WebElement we3=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
			Select s3=new Select(we3);
			s3.selectByIndex(5);
			WebElement we4=driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
			Select s4=new Select(we4);
			s4.selectByVisibleText("India");
			driver.findElement(By.name("submitButton")).click();
			WebElement we5=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
			Select s5=new Select(we5);
			s3.selectByIndex(5);
			
			
	}

}
