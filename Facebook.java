package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Saranya");
		driver.findElement(By.name("lastname")).sendKeys("Chandrasekaran");
		driver.findElement(By.name("reg_email__")).sendKeys("mksara01@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mksara01@gmail.com");

		driver.findElement(By.name("reg_passwd__")).sendKeys("saran2407");

		WebElement drop1 = driver.findElement(By.id("day"));
		Select drpDwn = new Select(drop1);
		drpDwn.selectByIndex(1);

		WebElement drop2 = driver.findElement(By.name("birthday_month"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByValue("1");

		WebElement drop3 = driver.findElement(By.id("year"));
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByVisibleText("1990");

		driver.findElement(By.name("sex")).click();
	}

}
