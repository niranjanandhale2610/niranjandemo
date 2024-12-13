import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption3")).click();
		String Label = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
		System.out.println(Label);
		
		WebElement Static = driver.findElement(By.id("dropdown-class-example"));	
		Select drpdwn = new Select(Static);
		drpdwn.selectByVisibleText(Label);
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(Label);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		
		if(text.contains(Label))
		{
			System.out.println("Alert Success");
		}
		else
		{
			System.out.println("Alert Failed");
		}

	}

}
