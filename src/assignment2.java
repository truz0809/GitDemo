import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("junkook");
		driver.findElement(By.name("email")).sendKeys("jk@bts.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));

		Select selectgender = new Select(gender);

		selectgender.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.name("bday")).sendKeys("12/12/2020");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.className("alert")).getText());

	}

}
