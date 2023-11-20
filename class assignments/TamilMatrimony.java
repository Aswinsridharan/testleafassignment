package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) {
		
		ChromeOptions Options =new ChromeOptions();
		Options.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver =new ChromeDriver(Options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.tamilmatrimony.in/");
		
		driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement findElement = driver.findElement(By.id("REGISTERED_BY"));
		Select dropDown=new Select(findElement);
		dropDown.selectByVisibleText("Myself");
		
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("ASWIN");
		driver.findElement(By.xpath("//input[@class='hp-gender']")).click();
		driver.findElement(By.xpath("(//select[@id='DOBDAY']/option)[3]")).click();
		driver.findElement(By.xpath("(//select[@id='DOBMONTH']/option)[6]")).click();
		driver.findElement(By.xpath("(//select[@id='DOBYEAR']/option)[5]")).click();
		
		driver.findElement(By.xpath("(//select[@id='RELIGION']/option)[2]")).click();
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select dropDown1 =new Select(findElement2);
		dropDown1.selectByVisibleText("Malayalam");
		
		driver.findElement(By.xpath("(//select[@id='CASTE_NORMAL']/option)[3]")).click();
		driver.findElement(By.xpath("(//select[@id='COUNTRY']/option)[2]")).click();
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("7358248963");
		driver.findElement(By.xpath("(//input[@class='hp-regform-txtfield'])[3]")).sendKeys("aswin@gmail.com");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	driver.findElement(By.id("selprofile")).click();
		//driver.findElement(By.className("setregisteredbyvalue")).click();	
		//driver.findElement(By.xpath("//label[text()='Male']")).click();
		//driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("ASWIN");
		//driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("7358248464");
		//driver.findElement(By.xpath("//input[@TYPE='button']")).click();
	
		
		
		
		
	}

}
