package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Gayathri");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Siruseri");
		driver.findElement(By.xpath("//input[@class='inputBox'][@name='annualRevenue']")).sendKeys("20000");
		WebElement we=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select s1=new Select(we);
		s1.selectByVisibleText("Computer Software");
		WebElement we1=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select s2=new Select(we1);
		s2.selectByVisibleText("S-Corporation");
		WebElement we2=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select s3=new Select(we2);
		s3.selectByValue("LEAD_EMPLOYEE");
		WebElement we3=driver.findElement(By.id("marketingCampaignId"));
		Select s4=new Select(we3);
		s4.selectByIndex(6);
		WebElement we4=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s5=new Select(we4);
		s5.selectByValue("TX");
		driver.findElement(By.xpath("//input[@type='submit'][@value='Create Account']")).click();
		
		

	}

}
