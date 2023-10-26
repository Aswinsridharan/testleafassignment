package auto;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	String text = driver.findElement(By.tagName("h2")).getText();
	//System.out.println(text);
	
	driver.findElement(By.linkText(("CRM/SFA"))).click();
	driver.findElement(By.linkText(("Leads"))).click();
	driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
	driver.findElement(By.xpath("//span[text()='From Lead']/following::img[1]")).click();
	Set<String> childWindow = driver.getWindowHandles();
	List<String> openedWindow=new ArrayList<String>(childWindow);
	driver.switchTo().window(openedWindow.get(1));
	driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/following::a[@class='linktext'][22]")).click();
	//driver.close();
	Thread.sleep(3000);
	driver.switchTo().window(openedWindow.get(0));
	String title=driver.getTitle();
	System.out.println("title"+title);
	
	driver.findElement(By.xpath("//span[text()='To Lead']/following::img[1]")).click();
	Set<String> childWindow1 = driver.getWindowHandles();
	List<String> openedWindow1=new ArrayList<String>(childWindow1);
	driver.switchTo().window(openedWindow1.get(1));
	driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/following::a[@class='linktext'][17]")).click();
	driver.switchTo().window(openedWindow.get(0));
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	Alert confirmalert = driver.switchTo().alert();
	confirmalert.accept();

	//driver.close();
}
}
