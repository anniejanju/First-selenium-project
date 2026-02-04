package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 ChromeDriver driver = new ChromeDriver();
 driver.get("https://www.saucedemo.com/");
 driver.manage().window().maximize();
 driver.findElement(By.id("user-name")).sendKeys("standard_user");
 driver.findElement(By.id("password")).sendKeys("secret_sauce");
 Thread.sleep(5000);
 driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
 Thread.sleep(5000); // wait 5 seconds
 driver.close();
 
 
	}

}
