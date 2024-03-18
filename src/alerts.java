import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String name="Jungkook";
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		
		//switch to alert window
		System.out.println(driver.switchTo().alert().getText());
		
		String namestring=driver.switchTo().alert().getText();
		
		String [] splitstring=namestring.split(",");
		
		Assert.assertEquals(splitstring[0].split(" ")[1],name);
		
		driver.switchTo().alert().accept();//accepts dialog 

		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());//gets text of pop up
		driver.switchTo().alert().dismiss();//clicks on cancel on alert box
		
		Select options=driver.findElements(By.className("form-control"))
		
		
		
		

	}

}
