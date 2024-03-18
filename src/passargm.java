//to fetch info from page and store it in variable and pass it as argument 

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class passargm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		passargm pwd=new passargm();
		String password=pwd.getPassword(driver);
		String name="trupz";
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
				

	}
	
public String getPassword(WebDriver driver) throws InterruptedException
{
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String password=(driver.findElement(By.cssSelector("form p")).getText());
	//Please use temporary password 'rahulshettyacademy' to Login.
	
	String[] splitpass1=password.split("'");
	String splitpass2=splitpass1[1].split("'")[0];
	System.out.println(splitpass2);
	
	
	return splitpass2;
}

}
