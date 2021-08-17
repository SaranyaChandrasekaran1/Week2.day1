package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk\r\n");

		driver.manage().window().maximize();
		WebElement webuser=driver.findElement(By.name("UserFirstName"));
        webuser.sendKeys("Ravi");
        
driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
driver.findElement(By.name("UserEmail")).sendKeys("mksara01@gmail.com");

WebElement drop1 = driver.findElement(By.name("UserTitle"));
Select drpDwn = new Select(drop1);
drpDwn.selectByIndex(3);


driver.findElement(By.name("CompanyName")).sendKeys("Testleaf");

WebElement drop2 = driver.findElement(By.name("CompanyEmployees"));
Select drpDwn2 = new Select(drop2);
drpDwn2.selectByIndex(2);

driver.findElement(By.name("UserPhone")).sendKeys("9535354555");


WebElement drop3 = driver.findElement(By.name("CompanyCountry"));
Select drpDwn3 = new Select(drop3);
drpDwn3.selectByVisibleText("India");
driver.findElement(By.className("checkbox-ui")).click();

driver.close();
}

}
