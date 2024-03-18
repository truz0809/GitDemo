import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class end2end {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='rbtnl_Trip_0']")).click();
		driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='JAI']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'destinationStation1_CTNR')]//a[@value='BOM']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("divpaxinfo")).click();

		int i = 1;

		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		driver.findElement(By.className("buttonN")).click();

		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select value = new Select(dropdown);
		value.selectByVisibleText("INR");

		driver.findElement(By.xpath("//input[contains(@name,'FindFlights')]"));

		driver.close();

	}

}
