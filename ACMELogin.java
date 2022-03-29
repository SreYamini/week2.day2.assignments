package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMELogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String title = driver.getTitle();
		
		System.out.println("The title of the page is "+ title);
		
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.close();
		

	}

}
