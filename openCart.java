package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String title = driver.getTitle();
		System.out.println(title);
		WebElement element1=driver.findElement(By.id("input-username"));
		element1.sendKeys("Saranyas");
				driver.findElement(By.id("input-firstname")).sendKeys("Saranya");
				driver.findElement(By.id("input-lastname")).sendKeys("Saravanan");
				driver.findElement(By.id("input-email")).sendKeys("mksara01@gmail.com");
				WebElement drop1=driver.findElement(By.id("input-country"));
				Select drpDwn=new Select(drop1);
				drpDwn.selectByVisibleText("India");
				driver.findElement(By.name("password")).sendKeys("mk837@");
				driver.close();



				
						

	}

}
