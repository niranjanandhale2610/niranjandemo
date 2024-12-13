import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://manthan.gov.in/");
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();
		

	}

}
