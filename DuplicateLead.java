package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']")).sendKeys("sreyamini22@gmail.com");
		
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		String Orgname = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
			
		System.out.println(Orgname);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Duplicate Lead']")).click();
		
		String duptitle = driver.getTitle();
		
		if(duptitle.contains("Duplicate Lead")) {
			
			System.out.println("The title is Duplicate lead "+duptitle);
		}
		
		else {
			System.out.println("The title is not Duplicate lead ");
		}
		
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(2000);
		
		String dupLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(dupLeadName.contains(Orgname)) {
			
			System.out.println("The name is duplicated");
		}
		
		else {
			System.out.println("The name is not duplicated");
		}
		
		//driver.close();
		
		

	}

}
