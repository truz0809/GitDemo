import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class locatorpractice {
	public static void main (String [] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.print
		(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText());
		
		driver.navigate().back();
		driver.navigate().forward();
	}
}
