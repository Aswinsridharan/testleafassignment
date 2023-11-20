package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/'");
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(300);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aswin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ss");	
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7358248964");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("A$win26");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		driver.findElement(By.xpath("//option[@value='19']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		driver.findElement(By.xpath("//option[@value='3']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		driver.findElement(By.xpath("//option[@value='2000']")).click();
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		//driver.close();
		
		
		
	}

}
