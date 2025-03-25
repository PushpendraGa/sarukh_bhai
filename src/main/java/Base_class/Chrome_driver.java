package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_driver {

@Test
	public void  lounch()

	{

		
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		String actualTitle = driver.getTitle();

		String expetedTitle = "pushpendra";
		
		if (actualTitle.equals(expetedTitle)) {
			
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
		
		

	}

}
