package ElementsPackage;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/iframes");  
		 
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		
		Iterator <String> I1 = s.iterator(); 
		while(I1.hasNext())
		{
			String childWindow = I1.next();
			if(!parent.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			} 
		}
		driver.switchTo().defaultContent();
	}

}
