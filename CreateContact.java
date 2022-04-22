package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Gayathri");
		driver.findElement(By.id("lastNameField")).sendKeys("Purushothaman");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Gayathri");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("P");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Test Automation");
		driver.findElement(By.id("createContactForm_description")).sendKeys("nothing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("gayathri@gmail.com");
		WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select s=new Select(state);
		s.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Any Text");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
		
		


		
		
		
		

	}

}
