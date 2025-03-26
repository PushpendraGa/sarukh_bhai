package pgae_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_page {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingbaba.com/old/");

		String actualTitle = driver.getTitle();
		System.out.println("My title is " + " " + actualTitle);
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[text()=\"×\"]")).click();
		
		driver.findElement(By.xpath("//a[text()=\"Practice\"]")).click();
		
		
		driver.close();

	}

}
