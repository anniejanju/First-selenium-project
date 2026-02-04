package javaproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
	//driver.get("http://www.google.com");
	driver.get("https://demoqa.com/text-box");
    driver.manage().window().maximize();

    // Fill the form fields
    driver.findElement(By.id("userName")).sendKeys("John Doe");
    driver.findElement(By.id("userEmail")).sendKeys("john@gmail.com");
    driver.findElement(By.id("currentAddress")).sendKeys("New York");
    driver.findElement(By.id("permanentAddress")).sendKeys("USA");

    // Submit the form
    driver.findElement(By.id("submit")).click();

    // Close browser
    driver.quit();
}
}
