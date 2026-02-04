package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQAButtonTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ultimateqa.com/automation");
		 driver.manage().window().maximize();
		 
		// driver.findElement(By.linkText("Big page with many elements")).click();
		// driver.findElement(By.linkText("Fake Landing Page")).click();
		 driver.findElement(By.linkText("Fill out forms")).click();
		 driver.findElement(By.id("name")).sendKeys("Annie");
		 driver.findElement(By.id("message")).sendKeys("Hello");
		 driver.findElement(By.linkText("Submit")).click();
		 
//driver.findElement(By.linkText("View Courses")).click();
	}

}
