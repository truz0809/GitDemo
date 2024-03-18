import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class demowebshop {
	public static void main(String[] args) {
		
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	//Log-in to Demowebshop
	driver.get("https://demowebshop.tricentis.com/"); 
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("v@bts.com");
	driver.findElement(By.className("password")).sendKeys("v@0809");
	driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
	
	
	
	}

}
