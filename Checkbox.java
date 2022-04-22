package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
List<WebElement> we=driver.findElements(By.xpath("//label[@for='java']/following-sibling::input"));
we.get(1).click();
we.get(2).click();

WebElement we1=driver.findElement(By.xpath("//label[contains(text(),'Confirm Selenium')]/following-sibling::input"));

boolean con=we1.isSelected();

if(con==true)
{
	System.out.println("Checked");
}
else
{
	System.out.println("Unchecked");
}

List <WebElement> we2=driver.findElements(By.xpath("//label[contains(text(),'DeSelect only checked')]/following-sibling::input"));

	
int s1=we2.size();

for(int i=0;i<s1;i++)
{
	if(we2.get(i).isSelected())
	{
		we2.get(i).click();
	}
	
}
List<WebElement> we3=driver.findElements(By.xpath("//label[contains(text(),'Select all below')]/following-sibling::input"));
int s2=we3.size();
for(int i=0;i<s2;i++)
{
	if(we3.get(i).isSelected()==false)
	{
	we3.get(i).click();
	}
	}
	}

}
