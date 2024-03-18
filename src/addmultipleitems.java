import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addmultipleitems {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] veggies = { "Mushroom", "Potato", "Pumpkin" };
		addmultipleitems obj = new addmultipleitems();
		obj.additems(driver, veggies,w);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("button[type='button']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.className("promoBtn")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public void additems(WebDriver driver, String[] veggies,WebDriverWait w) {
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;

		for (int i = 0; i < items.size(); i++) {
			String[] name = items.get(i).getText().split("-");

			String trimname = name[0].trim();

			List veggieslist = Arrays.asList(veggies);

			if (veggieslist.contains(trimname))

			{
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();- this did not work cz after clicking on add to cart
				// control text is changing which is then changing index of other items

			w.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='product-action']//button")));
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				j++;

			}

			if (j == veggies.length)// length is used to get size of array
				break;

		}

	}
}
