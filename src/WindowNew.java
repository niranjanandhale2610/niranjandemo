import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowNew {

	public static void main(String[] args) throws IOException {
		
		//Switch to new window
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String>handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentTab = it.next();
		String childtab = it.next();
		
		driver.switchTo().window(childtab);
		driver.get("https://rahulshettyacademy.com/");
		String text = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		driver.switchTo().window(parentTab);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(text);
		
		//Screenshot of Webelement
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		//Get height and Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

	}

}
