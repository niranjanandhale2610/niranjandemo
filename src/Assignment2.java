import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Niranjan");
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("Niranjan@1991");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("abcds");
        driver.findElement(By.id("exampleCheck1")).click();
        
        WebElement Staticdropdowns =driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdowns = new Select(Staticdropdowns);
        dropdowns.selectByIndex(1);
        
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.name("bday")).sendKeys("10/26/1991");
        driver.findElement(By.xpath("//input[contains(@class,'success')]")).click();
        System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());


	}

}
