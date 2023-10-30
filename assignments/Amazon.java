package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications","start-maximized");
			ChromeDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.amazon.in/");
			

			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 11");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			
			String firstProductPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
			System.out.println(firstProductPrice);
			

			String Ratings = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
			System.out.println("Number of customer rating"+Ratings);
			
//			5. Click the first text link of the first image
			driver.findElement(By.xpath("//h2[contains(@class,'a-color-base s-line-clamp-2')]")).click();
			
//			6. Take a screen shot of the product displayed
			
//			7. Click 'Add to Cart' button
			Set<String> Window = driver.getWindowHandles();
			List<String> childWindow = new ArrayList<String>(Window);
			
		    driver.switchTo().window(childWindow.get(1));
			driver.findElement(By.id("add-to-cart-button")).click();
			
//			8. Get the cart subtotal and verify if it is correct.
			Thread.sleep(3000);
			String cartTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
			System.out.println(cartTotal);
			
//			if(firstProductPrice==finalPrice) {
//				System.out.println("Price is validated");
//			}else {
//				System.out.println("Price is mismatching");
//			}
			
//			9.close the browser
			//driver.quit();
		
		
	}

}
