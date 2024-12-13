import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		String[] productList = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement options = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(options);
		dropdown.selectByIndex(2);
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		
		driver.manage().window().maximize();
		
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();
			
		}
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		

	}

}
