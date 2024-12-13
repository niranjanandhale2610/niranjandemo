import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortStreams {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on coloumn
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture all webelements into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort original list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String>Price;
		
		do{
			
			List<WebElement> RowList = driver.findElements(By.xpath("//tr/td[1]"));
		Price = RowList.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		Price.forEach(a->System.out.println(a));
		
		if(Price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
	}    
	    while(Price.size()<1);

	}
	
	public static String getPriceVeggie(WebElement s) {
		
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
		
	}

}
