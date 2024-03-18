import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class locator2 {

	public static void main(String[] args) throws InterruptedException
{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	
	String name="trupz";
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	driver.findElement(By.className("submit")).click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.tagName("p")).getText());
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello " +name+",");
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	driver.close();
}

}
