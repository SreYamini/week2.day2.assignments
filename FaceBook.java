package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Sre Yamini");
		
		driver.findElement(By.name("lastname")).sendKeys("I");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9786555294");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Xyz@123456789");
		
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select day = new Select(dropDown1);
		
		day.selectByIndex(21);
		
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select month = new Select(dropDown2);
		
		month.selectByValue("6");
		
		WebElement dropDown3 = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select year = new Select(dropDown3);
		
		year.selectByVisibleText("1994");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	

	}

}
