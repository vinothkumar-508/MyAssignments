package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("vinoth@outlook.com");
        driver.findElement(By.id("pass")).sendKeys("vinoth");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Find your account and log in")).click(); 
        driver.close();
	
	}

}
