import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("gf-BIG")); //Limiting webdriver scope
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement Coloumndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(Coloumndriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<Coloumndriver.findElements(By.tagName("a")).size();i++)
		{
//			open each link in new tab
			String ClickOnTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			Coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnTab);
			Thread.sleep(5000);
			
		}
		
		Set<String> Tabs = driver.getWindowHandles();
		Iterator<String> it = Tabs.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}


}
