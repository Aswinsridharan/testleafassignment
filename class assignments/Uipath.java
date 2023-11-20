package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Uipath {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://uibank.uipath.com/register-account");
		
		driver.findElement(By.id("firstName")).sendKeys("ASWIN");
		driver.findElement(By.id("lastName")).sendKeys("S");
		driver.findElement(By.id("middleName")).sendKeys("S");
		WebElement findElement = driver.findElement(By.xpath("//select[@id='sex']"));
		Select Dropdown =new Select(findElement);
		Dropdown.selectByVisibleText("Male");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("Mr");
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		Select Dropdown2=new Select(findElement2);
		Dropdown2.selectByVisibleText("Full-time");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("aswin@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aswin@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Arun$");
		
		
		
	}

}
