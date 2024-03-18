import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicdropdown {
	
public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='JAI']")).click();
		
		//driver.findElement(By.xpath("//a[@value='PAT'][2]")).click(); // indexing not working in dynamic list
		//switched to parent child traverse 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='PAT']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
		
		if(driver.findElement(By.className("picker-second")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
			System.out.print("Control is enable");
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		

}

}



