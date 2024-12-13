import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment7 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
		driver.findElement(By.xpath("//div/fieldset/table/tbody/tr"));
		
		WebElement Table = driver.findElement(By.id("product"));
	    System.out.println(Table.findElements(By.tagName("tr")).size());
	    System.out.println(Table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	    
	    List<WebElement> secondRow = Table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	    
	    System.out.println(secondRow.get(0).getText());
	    System.out.println(secondRow.get(1).getText());
	    System.out.println(secondRow.get(2).getText());



	}

}
