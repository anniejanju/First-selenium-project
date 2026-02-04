package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UltimateQAButtonTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ultimateqa.com/automation");
		 driver.manage().window().maximize();
		 
		// driver.findElement(By.linkText("Big page with many elements")).click();
		// driver.findElement(By.linkText("Fake Landing Page")).click();
		 driver.findElement(By.linkText("Fill out forms")).click();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("et_pb_contact_name_0")))
          .sendKeys("Annie");

      // wait for the Message field then type
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("et_pb_contact_message_0")))
          .sendKeys("Hello");

      // wait for submit button then click
      wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".et_pb_contact_submit ")))
          .click();
		 
//driver.findElement(By.linkText("View Courses")).click();
	}

}
