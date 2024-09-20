package ElementsPackage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Elements {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		int count=0;
		for(WebElement linkName: link)
		{
			System.out.println(linkName.getText());
			count++;
		}
		System.out.println("Total links in the website: "+count);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		int totalImages = images.size();
		System.out.println("Total images count is:"+totalImages);
		
		
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tbodyid']/div[2]/div/a")));
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	}

}
